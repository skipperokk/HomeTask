package ru.nauka.task.Service;

import org.springframework.stereotype.Service;
import ru.nauka.task.Exceptions.ThereIsNoSuchUserException;
import ru.nauka.task.Model.UserCalendar;
import ru.nauka.task.Model.Event;
import ru.nauka.task.Repository.CalendarRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CalendarService {

    private final CalendarRepository repository;

    public CalendarService(CalendarRepository repository) {
        this.repository = repository;
    }

    public List<UserCalendar> findUsersById(Long idUser) {
        return repository.findUsersById(idUser);
    }

    public List<Integer> getDays(List<UserCalendar> idUsers, int daysOfMonth) {
        List<Integer> days = new ArrayList<>();
        for (UserCalendar date : idUsers) {
            if (date.getCaldate().get(java.util.Calendar.MONTH) == daysOfMonth) {
                days.add(date.getCaldate().get(java.util.Calendar.DAY_OF_MONTH));
            } else if (daysOfMonth < 0 || daysOfMonth > 11) {
                throw new ThereIsNoSuchUserException();
            }
        }
        return days;
    }

    public List<Event> getEvents(List<UserCalendar> idUsers, int daysOfMonth) {
        List<Event> events = new ArrayList<>();
        for (UserCalendar date : idUsers) {
            if (date.getCaldate().get(java.util.Calendar.MONTH) == daysOfMonth) {
                events.add(date.getEvent());
            }
        }
        return events;
    }

    public Map<String, Integer> getSumOfEvents(List<Event> events) {
        Map<String, Integer> eventsMap = new HashMap<>();
        for (Event temp : events) {
            Integer count = eventsMap.get(temp.getEvent());
            eventsMap.put(temp.getEvent(), (count == null) ? 1 : count + 1);
        }
        return eventsMap;
    }

    public String[] getNameMonth() {
        return new String[]{"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь",
                "Октябрь", "Ноябрь", "Декабрь"};
    }
}
