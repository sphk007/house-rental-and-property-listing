package com.example.HouseRental.service;

import java.util.List;

import com.example.HouseRental.Model.House;

public interface HouseService {
    List < House > getAllHouses();
    void saveHouse(House House);
    House getHouseById(long id);
    void deleteHouseById(long id);
}