package com.example.HouseRental.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HouseRental.Model.House;

@Repository
public interface HouseRepository extends JpaRepository<House, Long>{

}