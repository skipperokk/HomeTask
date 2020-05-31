package ru.nauka.task.Service;

import org.springframework.stereotype.Service;
import ru.nauka.task.Model.User;
import ru.nauka.task.Repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User>findUsersByIdDepartment(Long idDepartment){
        return repository.findUsersByIdDepartment(idDepartment);
    }

    public User getOne(Long id){
        return repository.getOne(id);
    }



}
