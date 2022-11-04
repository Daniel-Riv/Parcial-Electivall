package com.example.Parcial.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
@Getter @Setter
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Integer id;

    @Column
    private String lastName;

    @Column
    private  String name;

    @Column(name = "birthday",nullable = false)
    private LocalDateTime birthday;

    @Column(name = "phone")
    private int phone;

    @OneToMany(fetch = FetchType.EAGER, mappedBy="student")
    @JsonIgnoreProperties("student")
    private List<Matter> matter;

    public Student(){
        matter = new ArrayList<>();
    }

    public Student(Integer id, String lastName, String name, LocalDateTime birthday, int phone) {
        this();
        this.lastName = lastName;
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
