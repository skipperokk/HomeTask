package ru.nauka.task.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nauka.task.Model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    @Override
    Department getOne(Long aLong);
}
