package com.greenfoxacademy.clothingproject.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

    @Entity
    @Table
    public class Warehouse {

        @Id
        int id;

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

        int in_store;

        public Warehouse(int id, String item_name, String manufacturer, String category, String size, Float unit_prise, int in_store) {

            this.id = id;
            this.item_name = item_name;
            this.manufacturer = manufacturer;
            this.category = category;
            this.size = size;
            this.unit_prise = unit_prise;
            this.in_store = in_store;
        }

        public Warehouse() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getItem_name() {
            return item_name;
        }

        public void setItem_name(String item_name) {
            this.item_name = item_name;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public Float getUnit_prise() {
            return unit_prise;
        }

        public void setUnit_prise(Float unit_prise) {
            this.unit_prise = unit_prise;
        }

        public int getIn_store() {
            return in_store;
        }

        public void setIn_store(int in_store) {
            this.in_store = in_store;
        }
    }

