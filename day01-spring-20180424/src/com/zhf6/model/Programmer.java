package com.zhf6.model;

import java.util.List;

public class Programmer {
    private List<String> cars;

    public Programmer() {
    }

    public Programmer(List<String> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "cars=" + cars +
                '}';
    }

    public List<String> getCars() {
        return cars;
    }

    public void setCars(List<String> cars) {
        this.cars = cars;
    }
}
