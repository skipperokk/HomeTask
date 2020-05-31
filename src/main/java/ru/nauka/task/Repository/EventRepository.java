package ru.nauka.task.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nauka.task.Model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}
