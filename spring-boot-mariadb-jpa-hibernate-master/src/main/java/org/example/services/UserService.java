package org.example.services;

import org.example.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Service
public class UserService {

    @Autowired
    EntityManager em;

    @Transactional
    public User create(String email, String name) {
        User user = new User(email, name);
        em.persist(user);
        return user;
    }

}
