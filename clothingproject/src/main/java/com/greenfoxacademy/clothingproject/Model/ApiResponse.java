package com.greenfoxacademy.clothingproject.Model;

import java.util.List;

public class ApiResponse {

    String result;
    List<ShoppingPlanner> clothes;

    public ApiResponse() {
    }

    public ApiResponse(List<ShoppingPlanner> clothes) {
        this.result = "ok";
        this.clothes = clothes;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<ShoppingPlanner> getClothes() {
        return clothes;
    }

    public void setClothes(List<ShoppingPlanner> clothes) {
        this.clothes = clothes;
    }
}


