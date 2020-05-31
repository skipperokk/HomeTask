package ru.nauka.task.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.nauka.task.Model.Event;
import ru.nauka.task.Service.EventService;

import java.util.List;

@Controller
public class EventController {
    private final EventService service;

    public EventController(EventService service) {
        this.service = service;
    }

    @GetMapping
    public String findAll(Model model){
        List<Event> eventList = service.findAll();
        model.addAttribute("events", eventList);
        return "events";
    }
}
