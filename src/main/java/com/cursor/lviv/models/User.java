package com.cursor.lviv.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, List<Book> bookList) {
        this.name = name;
        this.bookList = bookList;
    }

    @OneToMany(mappedBy = "owner",
            cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Book> bookList;



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
