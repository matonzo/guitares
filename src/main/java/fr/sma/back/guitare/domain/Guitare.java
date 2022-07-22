package fr.sma.back.guitare.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@SequenceGenerator(name = "default_seq", sequenceName = "guitare_seq", allocationSize = 1)
public class Guitare extends AbstractEntity {

	private String brand;

	private String model;

	private Integer stringNumber = 6;

	private Double price;

}
