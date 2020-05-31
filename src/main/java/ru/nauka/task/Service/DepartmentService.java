package ru.nauka.task.Service;

import org.springframework.stereotype.Service;
import ru.nauka.task.Model.Department;
import ru.nauka.task.Repository.DepartmentRepository;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    public List<Department> findAll() {
        return repository.findAll();
    }

    public Department getOne(Long idDepartment) {
        return repository.getOne(idDepartment);
    }
}
