package com.sunglowsys.service;

import com.sunglowsys.domain.HotelInventory;
import com.sunglowsys.repository.HotelInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelInventoryServiceImpl implements HotelInventoryService{

    @Autowired
    private HotelInventoryRepository hotelInventoryRepository;



    @Override
    public HotelInventory save(HotelInventory hotelInventory) {
        return hotelInventoryRepository.save(hotelInventory);
    }

    @Override
    public HotelInventory update(HotelInventory hotelInventory, Long id) {
        HotelInventory hotelInventory1 =  hotelInventoryRepository.getById(id);
        hotelInventory1.setTotalInventory(hotelInventory.getTotalInventory());
        return hotelInventoryRepository.save(hotelInventory1);
    }

    @Override
    public List<HotelInventory> findAll() {
        return hotelInventoryRepository.findAll();
    }

    @Override
    public HotelInventory findById(Long id) {
        Optional<HotelInventory> optional=hotelInventoryRepository.findById(id);
        HotelInventory hotelInventory=null;
        if (optional.isPresent()) {
            hotelInventory=optional.get();
        }
        else {
            throw new RuntimeException("record not found for idNo:"+id);

        }
        return hotelInventory;
    }

    @Override
    public void delete(Long id) {
        hotelInventoryRepository.deleteById(id);

    }
}
