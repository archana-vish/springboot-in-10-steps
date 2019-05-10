package com.av8242n.springboot.angular7.basics.jpain10steps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {


    @GeneratedValue // autogenerated value
    @Id // This is the primary key
    private long id;

    private String name;
    private String role;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //FOR JPA WE NEED THIS!!!!!!!!!!!!!
    public User() {

    }

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
