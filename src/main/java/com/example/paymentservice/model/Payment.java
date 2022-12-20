package com.example.paymentservice.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String paymentId;

    private String userId;

    private float price;

    private String paymentMethod;
}
