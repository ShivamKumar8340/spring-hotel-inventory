package com.sunglowsys.controller;

import com.sunglowsys.domain.HotelInventory;
import com.sunglowsys.service.HotelInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelInventoryResource {

    @Autowired
    private HotelInventoryService hotelInventoryService;

    @PostMapping("/hotelInventories")
    public HotelInventory create(@RequestBody HotelInventory hotelInventory){
        return hotelInventoryService.save(hotelInventory);
    }

    @PutMapping("hotelInventories/{id}")
    public HotelInventory update(@RequestBody HotelInventory hotelInventory, @PathVariable("id") Long id) {

        return hotelInventoryService.update(hotelInventory,id);
    }

    @GetMapping("/hotelInventories")
    public List<HotelInventory> getAll() {
        List<HotelInventory> hotelInventories=hotelInventoryService.findAll();
        return hotelInventories;
    }

    @GetMapping("/hotelInventories/{id}")
    public HotelInventory getById(@PathVariable("id") Long id) {
        return hotelInventoryService.findById(id);
    }

    @DeleteMapping("/hotelInventories/{id}")
    public void delete(@PathVariable("id") Long id) {
        hotelInventoryService.delete(id);
    }
}
