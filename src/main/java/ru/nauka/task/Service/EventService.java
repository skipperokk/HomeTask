package ru.nauka.task.Service;

import org.springframework.stereotype.Service;
import ru.nauka.task.Model.Event;
import ru.nauka.task.Repository.EventRepository;

import java.util.List;

@Service
public class EventService {
    private final EventRepository repository;

    public EventService(EventRepository repository) {
        this.repository = repository;
    }

    public List<Event> findAll() {
        return repository.findAll();
    }
}
