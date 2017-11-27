package com.greenfoxacademy.clothingproject.Controller;

import com.greenfoxacademy.clothingproject.Model.ApiResponse;
import com.greenfoxacademy.clothingproject.Model.ShoppingPlanner;
import com.greenfoxacademy.clothingproject.Model.ShoppingPlannerSummary;
import com.greenfoxacademy.clothingproject.Repository.WarehouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    WarehouseRepo repo;

    /*@GetMapping("/warehouse")
    return Warehouse;

    @PostMapping("/warehouse/summary")
    return ShoppingPlannerSummary;

    @GetMapping("/warehouse/query")
    return ApiResponse;*/

}
