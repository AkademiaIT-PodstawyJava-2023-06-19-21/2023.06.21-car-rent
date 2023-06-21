package com.comarch.szkolenia.car.rent.database;

import com.comarch.szkolenia.car.rent.model.Car;

public class CarRepository {
    private final Car[] cars = new Car[5];

    public CarRepository() {
        this.cars[0] = new Car("BMW", "3", 300.0, "KR11");
        this.cars[1] = new Car("Audi", "A5", 350.0, "KR22");
        this.cars[2] = new Car("Toyota", "Corolla", 200.0, "KR33");
        this.cars[3] = new Car("KIA", "Ceed", 350.0, "KR44");
        this.cars[4] = new Car("Honda", "Accord", 300.0, "KR55");
    }

    public Car[] getCars() {
        return this.cars;
    }

    public boolean rentCar(String plate) {
        for(Car car : this.cars) {
            if(car.getPlate().equals(plate) && !car.isRent()) {
                car.setRent(true);
                return true;
            }
        }
        return false;
    }
}
