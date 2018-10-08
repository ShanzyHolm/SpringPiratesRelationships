package com.example.codeclan.pirateservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.xml.internal.bind.v2.TODO;

import javax.persistence.*;
import java.util.List;

//annotations - like
@Entity
@Table(name = "pirates")

public class Pirate {

//    TODO: add properties for: - firstName - lastName - age

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "ship_id", nullable = false)
    private Ship ship;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "pirate_raid", joinColumns = {@JoinColumn(name = "raid_id", nullable = false, updatable = false)}, inverseJoinColumns = {@JoinColumn(name = "pirate_id", nullable = false, updatable = false)
    })


    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "age")
    private int age;


//    TODO: constructor

    public Pirate(String firstName, String lastName, int age, Ship ship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ship = ship;

    }

    public Pirate(){ //default constructor

    }

//    TODO: Getters and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }




}
