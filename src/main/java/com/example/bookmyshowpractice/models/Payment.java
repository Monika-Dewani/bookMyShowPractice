package com.example.bookmyshowpractice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseClass{
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    private String thirdPartyReferenceId;

}
