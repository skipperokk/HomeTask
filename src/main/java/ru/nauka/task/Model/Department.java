package ru.nauka.task.Model;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table (name="department")
@Getter
public class Department {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long iddepartment;

    @Column(name = "namedepartment")
    private String namedepartment;

    @ToString.Exclude
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<User> users;

}
