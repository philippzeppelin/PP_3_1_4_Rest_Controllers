package ru.kata.spring.boot_security.demo.services;

import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.entities.User;

import java.util.List;

@Service
public interface UserService {
    List<User> findAll();

    User findById(Long id);

    User getCurrentUser();

    void saveUser(User user);

    void updateUser(long id, User updatedUser);

    void deleteUser(long id);

    void deleteAllUsers();

    User findUserByUsername(String username);
}