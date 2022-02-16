package com.sunglowsys.service;

import com.sunglowsys.domain.HotelInventory;

import java.util.List;

public interface HotelInventoryService {

    HotelInventory save(HotelInventory hotelInventory);

    HotelInventory update(HotelInventory hotelInventory,Long id);

    List<HotelInventory> findAll();

    HotelInventory findById(Long id);

    void delete(Long id);
}
