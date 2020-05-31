package ru.nauka.task.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.nauka.task.Model.Department;
import ru.nauka.task.Model.User;
import ru.nauka.task.Service.DepartmentService;
import ru.nauka.task.Service.UserService;

import java.util.List;

@Controller
public class UserController {
    private final UserService service;
    private final DepartmentService serviceD;


    public UserController(UserService service, DepartmentService serviceD) {
        this.service = service;
        this.serviceD = serviceD;
    }


    @GetMapping("/users/{idDepartment}")
    public String findUsersByIdDepartment(@PathVariable("idDepartment") Long idDepartment, Model model) {
        List<User> list = service.findUsersByIdDepartment(idDepartment);
        model.addAttribute("users", list);
        List<Department> departmentList = serviceD.findAll();
        model.addAttribute("departments", departmentList);
        Department department = serviceD.getOne(idDepartment);
        model.addAttribute("department", department);

        return "users";
    }
}
