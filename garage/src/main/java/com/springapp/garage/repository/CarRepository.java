package com.springapp.garage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springapp.garage.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

}