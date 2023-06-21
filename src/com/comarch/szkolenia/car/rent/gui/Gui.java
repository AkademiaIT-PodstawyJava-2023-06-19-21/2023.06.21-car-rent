package com.comarch.szkolenia.car.rent.gui;

import com.comarch.szkolenia.car.rent.model.Car;

import java.util.Scanner;

public class Gui {
    private final Scanner scanner = new Scanner(System.in);
    public String showMenuAndReadChoose() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");
        return scanner.nextLine();
    }

    public void listCars(Car[] cars) {
        for(Car car : cars) {
            System.out.println(new StringBuilder()
                    .append(car.getBrand())
                    .append(" ")
                    .append(car.getModel())
                    .append(" Cena: ")
                    .append(car.getPrice())
                    .append(" Rejestracja: ")
                    .append(car.getPlate())
                    .append(" ")
                    .append(car.isRent() ? "Niedostepny" : "Dostepny"));
        }
    }

    public String askForPlate() {
        System.out.println("Enter Plate:");
        return scanner.nextLine();
    }
}