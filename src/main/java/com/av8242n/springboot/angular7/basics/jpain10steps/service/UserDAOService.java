package com.av8242n.springboot.angular7.basics.jpain10steps.service;

import com.av8242n.springboot.angular7.basics.jpain10steps.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository // stores data in database
@Transactional // To handle transaction
public class UserDAOService {

    @PersistenceContext // to track the context
    private EntityManager entityManager;


    public long insert(User user){
        // Open Transaction
        entityManager.persist(user);
        // Close Transaction
        return user.getId();
    }
}
