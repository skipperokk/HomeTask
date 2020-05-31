package ru.nauka.task.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.nauka.task.Model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM user WHERE department_iddepartment=:idDepartment", nativeQuery = true)
    List<User> findUsersByIdDepartment(@Param("idDepartment") Long idDepartment);

    @Override
    User getOne(Long tabNumber);
}

