// CarController.java

package com.springapp.garage.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.springapp.garage.model.Car;
import com.springapp.garage.service.CarService;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;
    
    @GetMapping
    public ResponseEntity<List<Car>> getAllCars() {
        List<Car> cars = carService.getAllCars();
        return new ResponseEntity<>(cars, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable Long id) {
        Car car = carService.getCarById(id);
        return new ResponseEntity<>(car, HttpStatus.OK);
    }
    
    @PostMapping("/newCar")
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        Car newCar = carService.createCar(car);
        return new ResponseEntity<>(newCar, HttpStatus.CREATED);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable("id") Long id, @RequestBody Car updatedCar) {
        Car car = carService.updateCar(id, updatedCar);
        return new ResponseEntity<>(car, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

