package org.cventbootcamp;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public Dealership dealership;

    public UserInterface() {
    }

    public void display() {
        init();
        int optionSelected = 0;
        while (optionSelected != 99) {
            displayMessage();

            Scanner scanner = new Scanner(System.in);
            optionSelected = scanner.nextInt();

            switch (optionSelected) {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetColorRequest();
                    break;
                case 5:
                    processGetMileageRequest();
                    break;
                case 6:
                    processGetVehicleByTypeRequest();
                    break;
                case 7:
                    processAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 99:
                    break;
            }

        }

    }

    private void init() {
        DealershipFileManager myFileManager = new DealershipFileManager();
        this.dealership = myFileManager.getDealership();
    }

    private void displayMessage() {
        System.out.println("Welcome to the Dealership");
        System.out.println("Enter an Option to Continue: ");
        System.out.println("1 - Find vehicles within a price range");
        System.out.println("2 - Find vehicles by make / model");
        System.out.println("3 - Find vehicles by year range");
        System.out.println("4 - Find vehicles by color");
        System.out.println("5 - Find vehicles by mileage range");
        System.out.println("6 - Find vehicles by type (car, truck, SUV, van)");
        System.out.println("7 - List ALL vehicles");
        System.out.println("8 - Add a vehicle");
        System.out.println("9 - Remove a vehicle");
        System.out.println("99 - Quit");
    }

    private void processGetByPriceRequest() {}

    private void processGetByMakeModelRequest() {}

    private void processGetByYearRequest() {}

    private void processGetColorRequest() {}

    private void processGetVehicleByTypeRequest() {}

    private void processGetMileageRequest() {}

    private void processAllVehiclesRequest() {
        List<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);
    }

    private void processAddVehicleRequest() {
    }

    private void processRemoveVehicleRequest() {}

    private void displayVehicles(List<Vehicle> vehicles) {
        System.out.println("List of Vehicles");
  
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
