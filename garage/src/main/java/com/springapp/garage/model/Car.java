package com.springapp.garage.model;

import jakarta.persistence.*;

@Entity
public class Car {
	public enum Color {
		vert,
		jaune,
		bleu,
		rouge,
		noir
	}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brand;
    private String model;
    private int year;
    @Enumerated(EnumType.STRING)
    private Color color;
    
    public Car() {
    	
    }
	public Car(Long id, String brand, String model, int year, Color color) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}



