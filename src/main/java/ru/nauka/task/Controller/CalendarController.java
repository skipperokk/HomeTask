package ru.nauka.task.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.nauka.task.Model.UserCalendar;
import ru.nauka.task.Model.Event;
import ru.nauka.task.Model.User;
import ru.nauka.task.Service.CalendarService;
import ru.nauka.task.Service.UserService;

import java.util.List;
import java.util.Map;

@Controller
public class CalendarController {

    private final CalendarService calendarService;
    private final UserService userService;


    public CalendarController(CalendarService calendarService, UserService userService) {
        this.calendarService = calendarService;
        this.userService = userService;
    }

    @GetMapping("/calendar/{idUser}/{month}")
    public String modelAndViewCalendar(@PathVariable("idUser") Long idUser,
                               @PathVariable("month") int month,
                               Model model) {

        List<UserCalendar> users = calendarService.findUsersById(idUser);

        List<Event> events = calendarService.getEvents(users, month);
        Map<String, Integer> sumOfEvents = calendarService.getSumOfEvents(events);
        String[] nameOfMonths = calendarService.getNameMonth();

        model.addAttribute("events", events);
        model.addAttribute("sumOfEvents", sumOfEvents);
        model.addAttribute("nameOfMonths", nameOfMonths);

        List<Integer> days = calendarService.getDays(users, month);
        model.addAttribute("days", days);

        User user = userService.getOne(idUser);
        model.addAttribute("user", user);

        return "calendar";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }
}
