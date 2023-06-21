package com.comarch.szkolenia.car.rent;

import com.comarch.szkolenia.car.rent.database.CarRepository;
import com.comarch.szkolenia.car.rent.gui.Gui;

public class App {
    public static void main(String[] args) {
        CarRepository carRepository = new CarRepository();
        Gui gui = new Gui();
        mainLoop: while(true) {
            String choose = gui.showMenuAndReadChoose();
            switch (choose) {
                case "1":
                    gui.listCars(carRepository.getCars());
                    break;
                case "2":
                    boolean result = carRepository.rentCar(gui.askForPlate());
                    System.out.println(result ? "Success !!" : "Error !!");
                    break;
                case "3":
                    break mainLoop;
                default:
                    System.out.println("Wrong choose !!! Wpisales: " + choose);
            }
        }
    }
}
