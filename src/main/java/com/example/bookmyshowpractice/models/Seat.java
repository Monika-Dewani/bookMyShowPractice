package com.example.bookmyshowpractice.models;

import jakarta.persistence.Entity;

import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseClass{
    @ManyToOne
    private SeatType seatType;
    private String name;
    private int rowNumber;
    private int colNumber;
}
