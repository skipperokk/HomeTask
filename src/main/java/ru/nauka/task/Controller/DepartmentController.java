package ru.nauka.task.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.nauka.task.Model.Department;
import ru.nauka.task.Service.DepartmentService;

import java.util.List;

@Controller
public class DepartmentController {
    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @GetMapping ("/")
    public String findAll(Model model){
        List<Department> departmentList = service.findAll();
        model.addAttribute("departments", departmentList);
        return "departments";
    }
}
