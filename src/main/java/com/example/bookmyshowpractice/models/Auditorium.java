package com.example.bookmyshowpractice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Auditorium extends BaseClass{
    private String name;
    @OneToMany(mappedBy = "auditorium")
    private List<Picture> pictures;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Features> features;
    @OneToMany
    private List<Seat> seats;
}
