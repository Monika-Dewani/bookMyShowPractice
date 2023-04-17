package com.example.bookmyshowpractice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity
public class Ticket extends BaseClass{
    @ManyToOne
    private Show show;
    @OneToMany
    private List<Payment> payments;
    private double amount;
    @ManyToMany
    private List<ShowSeat> showSeats;
    private Date bookingTime;
    @Enumerated(EnumType.ORDINAL)
    private TicketStatus ticketStatus;

}
