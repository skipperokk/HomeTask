package ru.nauka.task.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.nauka.task.Model.UserCalendar;

import java.util.Date;
import java.util.List;

public interface CalendarRepository extends JpaRepository<UserCalendar, Date> {

    List<UserCalendar> findAll();

    @Query(value = "SELECT * FROM calendar WHERE user_iduser=:id", nativeQuery = true)
    List<UserCalendar> findUsersById(@Param("id") Long idUser);
}

