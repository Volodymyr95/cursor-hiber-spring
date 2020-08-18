package com.cursor.lviv.repository;

import com.cursor.lviv.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public class UserRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void createUser(User user) {
        getCurrentSession().persist(user);
    }

    @Transactional
    public User getUserById(Long id) {
        return (User) getCurrentSession().createQuery("Select u From User u WHERE id = 1").list().get(0); //HQL - Hibernate query lang.
    }


    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}
