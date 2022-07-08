package fr.sma.back.guitare.domain;

import lombok.Data;

@Data
public class Guitare {

    private Long id;
    private String brand;
    private String model;
    private Integer stringNumber;
    private Double price;
}
