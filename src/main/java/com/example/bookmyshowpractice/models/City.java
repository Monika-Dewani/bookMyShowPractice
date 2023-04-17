package com.example.bookmyshowpractice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class City extends BaseClass{
    private String name;
    @OneToMany
    private List<Theater> theaters;


}
