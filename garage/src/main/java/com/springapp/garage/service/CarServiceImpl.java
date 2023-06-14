package com.springapp.garage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.garage.exception.ResourceNotFoundException;
import com.springapp.garage.model.Car;
import com.springapp.garage.repository.CarRepository;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

	@Override
	public Car updateCar(Long id, Car updatedCar) {
        Car car = carRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Car not found with id: " + id));
        car.setBrand(updatedCar.getBrand());
        car.setModel(updatedCar.getModel());
        car.setYear(updatedCar.getYear());
        car.setColor(updatedCar.getColor());
        return carRepository.save(car);
	}
}
