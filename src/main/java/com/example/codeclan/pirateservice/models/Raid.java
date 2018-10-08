package com.example.codeclan.pirateservice.models;



import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "raids")


public class Raid {

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "pirate_raid", joinColumns = {@JoinColumn(name = "pirate_id", nullable = false, updatable = false)
    }, inverseJoinColumns = {@JoinColumn(name = "raid_id", nullable = false, updatable = false)}
    )


    public List<Pirate> getPirates(){
        return pirates;
    }



}
