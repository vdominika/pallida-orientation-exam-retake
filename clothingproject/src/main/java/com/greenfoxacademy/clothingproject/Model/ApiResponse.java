package com.greenfoxacademy.clothingproject.Model;

import java.util.List;

public class ApiResponse {

    String result;
    List<Warehouse> clothes;

    public ApiResponse() {
    }

    public ApiResponse(List<Warehouse> clothes) {
        this.result = "ok";
        this.clothes = clothes;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<Warehouse> getClothes() {
        return clothes;
    }

    public void setClothes(List<Warehouse> clothes) {
        this.clothes = clothes;
    }
}


