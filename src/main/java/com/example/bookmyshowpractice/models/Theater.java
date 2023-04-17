package com.example.bookmyshowpractice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Theater extends BaseClass {
    private String name;
    private String address;
    @OneToMany
    private List<Auditorium> auditorium;
    private String company;

}
