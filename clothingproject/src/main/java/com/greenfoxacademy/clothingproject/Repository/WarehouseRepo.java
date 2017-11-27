package com.greenfoxacademy.clothingproject.Repository;

import com.greenfoxacademy.clothingproject.Model.ShoppingPlanner;
import org.springframework.data.repository.CrudRepository;

public interface WarehouseRepo extends CrudRepository<ShoppingPlanner, Integer> {
}
