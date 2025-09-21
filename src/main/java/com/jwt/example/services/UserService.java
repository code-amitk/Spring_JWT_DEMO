package com.jwt.example.services;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();


    public UserService() {
        store.add(new User("amit", UUID.randomUUID().toString(), "test-1@mail.com"));
        store.add(new User("shiv", UUID.randomUUID().toString(), "test-2@mail.com"));
        store.add(new User("Sandy", UUID.randomUUID().toString(), "test-3@mail.com"));
        store.add(new User("rahul", UUID.randomUUID().toString(), "test-4@mail.com"));
    }

    public List<User> getUsers() {
        return this.store;
    }
}
