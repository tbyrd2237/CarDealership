package org.cventbootcamp;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DealershipFileManager {

    public Dealership getDealership() {
        try {
            File myFile = new File("src/main/java/org/cventbootcamp/inventory.csv");
            Scanner myReader = new Scanner(myFile);
            String dealershipInfo = myReader.nextLine();
            String[] dealershipString = dealershipInfo.split("\\|");
            List<String> newDealershipList = Arrays.asList(dealershipString);

            Dealership dealership = new Dealership(newDealershipList.get(0), newDealershipList.get(1), newDealershipList.get(2));

            while (myReader.hasNextLine()) {
                String vehicleInfo = myReader.nextLine();
                String[] vehicleString = vehicleInfo.split("\\|");

                int vinNumberInt = Integer.parseInt(vehicleString[0]);

                int yearInt = Integer.parseInt(vehicleString[1]);

                String make = vehicleString[2];
                String model = vehicleString[3];
                String type = vehicleString[4];
                String color = vehicleString[5];

                int mileageInt = Integer.parseInt(vehicleString[6]);

                double priceDouble = Double.parseDouble(vehicleString[7]);

                Vehicle vehicle = new Vehicle(vinNumberInt, yearInt, make, model, type, color, mileageInt, priceDouble);

                dealership.addVehicle(vehicle);
            }
            return dealership;
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            return null;
        }
    }

    public void saveDealership(Dealership dealership){

    }
}
