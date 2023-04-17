package com.example.bookmyshowpractice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Movie extends BaseClass{
    private String name;
    @ManyToMany
    private List<Actor> actors;
}
