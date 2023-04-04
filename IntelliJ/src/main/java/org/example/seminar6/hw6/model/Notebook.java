package org.example.seminar6.hw6.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
public class Notebook {

    private String brand;
    private String model;
    private String cpu;
    private int ram;
    private int ssd;
    private int price;

    public Notebook(String brand, String model, String cpu, Integer ram, Integer ssd, Integer price) {
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ноутбук: " + brand  +
                " Модель: " + model +
                " Процессор: " + cpu +
                ", Объем оперативной памяти: " + ram +
                ", Обьем памяти: " + ssd +
                ", Цена: " + price +
                "\n" ;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getSsd() {
        return ssd;
    }

    public void setSsd(Integer ssd) {
        this.ssd = ssd;
    }
}
