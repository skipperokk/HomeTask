package ru.nauka.task.Model;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "user")
@Getter
public class User {
    @Id
    @GeneratedValue
    @Column(name = "tab_number")
    private Long tab_number;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "position")
    private String position;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "department_iddepartment")
    private Department department;

    @ToString.Exclude
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserCalendar> userCalendar;
}
