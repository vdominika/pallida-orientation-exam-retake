package com.greenfoxacademy.clothingproject.Service;

import com.greenfoxacademy.clothingproject.Model.Warehouse;
import com.greenfoxacademy.clothingproject.Repository.WarehouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingPlannerService {

    @Autowired
    WarehouseRepo repo;

    public List<Warehouse> getAll() {
        List<Warehouse> clothes = new ArrayList<>();
        repo.findAll()
                .forEach(clothes::add);
        return clothes;



}
