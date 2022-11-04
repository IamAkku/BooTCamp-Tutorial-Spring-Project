package com.bootcamp.service;


import com.bootcamp.model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    User findByUsername(String username);

    /* List all the Users with Details */
    List<User> getUsersList();
}
