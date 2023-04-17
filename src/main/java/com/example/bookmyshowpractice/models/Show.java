package com.example.bookmyshowpractice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity
public class Show extends BaseClass{
    @ManyToOne
    private Auditorium auditorium;
    private Date startTime;
    private Date endTime;
    @ManyToOne
    private Movie movie;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Features> features;

}
