package ru.nauka.task.Model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.Calendar;

@Data
@Entity
@Table(name = "calendar")
@Getter
@IdClass(UserCalendarId.class)
public class UserCalendar {

    @Id
    @Column(name = "caldate")
    private Calendar caldate;

    @Id
    @Column(name = "user_iduser")
    private Long user_iduser;

    @Column(name = "event_idevent")
    private Long event_idevent;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_iduser", insertable = false, updatable = false)
    private User user;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "event_idevent", insertable = false, updatable = false)
    private Event event;
}
