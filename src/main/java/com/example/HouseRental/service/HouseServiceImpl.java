package com.example.HouseRental.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HouseRental.Model.House;
import com.example.HouseRental.repo.HouseRepository;

@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseRepository HouseRepository;

    @Override
    public List < House > getAllHouses() {
        return HouseRepository.findAll();
    }

    @Override
    public void saveHouse(House House) {
        this.HouseRepository.save(House);
    }

    @Override
    public House getHouseById(long id) {
        Optional < House > optional = HouseRepository.findById(id);
        House House = null;
        if (optional.isPresent()) {
            House = optional.get();
        } else {
            throw new RuntimeException(" House not found for id :: " + id);
        }
        return House;
    }

    @Override
    public void deleteHouseById(long id) {
        this.HouseRepository.deleteById(id);
    }
}