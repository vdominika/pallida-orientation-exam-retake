package com.greenfoxacademy.clothingproject.Model;

import javax.persistence.Column;
import javax.persistence.Table;

@Table
public class ShoppingPlannerSummary {

    @Column
    String item_name;

    @Column
    String manufacturer;

    @Column
    String category;

    @Column
    String size;

    @Column
    Float unit_prise;

    

}
