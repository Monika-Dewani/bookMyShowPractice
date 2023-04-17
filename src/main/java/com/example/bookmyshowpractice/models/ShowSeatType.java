package com.example.bookmyshowpractice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends BaseClass{
    @ManyToOne
    private Picture picture;
    @ManyToOne
    private SeatType seatType;
    private double price;

}
