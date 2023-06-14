package com.springapp.garage.service;

import java.util.List;

import com.springapp.garage.model.Car;

public interface CarService {
	
	List<Car> getAllCars();

	Car getCarById(Long id);

	Car createCar(Car car);

	void deleteCar(Long id);
	
	Car updateCar(Long id, Car updatedCar);

}
