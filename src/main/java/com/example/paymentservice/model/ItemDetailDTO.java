package com.example.paymentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemDetailDTO {

    private int id;

    private String name;

    private String description;

    private String genre;

    private String author;

    private float price;

    private int quantity;
}
