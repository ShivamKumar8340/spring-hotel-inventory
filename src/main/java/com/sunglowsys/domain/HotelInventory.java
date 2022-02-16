package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class HotelInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer totalInventory;
    private Integer hotel_id;
    private Integer room_type_id;

    public HotelInventory () {}

    public HotelInventory(Integer totalInventory, Integer hotel_id, Integer room_type_id) {
        this.totalInventory = totalInventory;
        this.hotel_id = hotel_id;
        this.room_type_id = room_type_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTotalInventory() {
        return totalInventory;
    }

    public void setTotalInventory(Integer totalInventory) {
        this.totalInventory = totalInventory;
    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Integer getRoom_type_id() {
        return room_type_id;
    }

    public void setRoom_type_id(Integer room_type_id) {
        this.room_type_id = room_type_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelInventory that = (HotelInventory) o;
        return Objects.equals(id, that.id) && Objects.equals(totalInventory, that.totalInventory) && Objects.equals(hotel_id, that.hotel_id) && Objects.equals(room_type_id, that.room_type_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, totalInventory, hotel_id, room_type_id);
    }

    @Override
    public String toString() {
        return "HotelInventory{" +
                "id=" + id +
                ", totalInventory=" + totalInventory +
                ", hotel_id=" + hotel_id +
                ", room_type_id=" + room_type_id +
                '}';
    }
}

