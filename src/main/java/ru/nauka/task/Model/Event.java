package ru.nauka.task.Model;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "event")
@Getter
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idevent;

    @Column(name = "event")
    private String event;

    @ToString.Exclude
    @OneToMany(mappedBy = "event")
    private List<UserCalendar> userCalendar;
}
