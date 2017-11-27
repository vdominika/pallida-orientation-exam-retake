package com.greenfoxacademy.clothingproject.Controller;

import com.greenfoxacademy.clothingproject.Model.ApiResponse;
import com.greenfoxacademy.clothingproject.Model.ShoppingPlanner;
import com.greenfoxacademy.clothingproject.Model.ShoppingPlannerSummary;
import com.greenfoxacademy.clothingproject.Model.Warehouse;
import com.greenfoxacademy.clothingproject.Repository.WarehouseRepo;
import com.greenfoxacademy.clothingproject.Service.ShoppingPlannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    ShoppingPlannerService shoppingPlannerService;

    @GetMapping("/warehouse")
    public List<Warehouse> getAllTopics() {

        return shoppingPlannerService.getAll();
    }

    @PostMapping("/warehouse/summary")
    public List<Warehouse> findAllselected(){
        return shoppingPlannerService.getSelected();
    };

    @GetMapping("/warehouse/query")
    return ApiResponse;

}
