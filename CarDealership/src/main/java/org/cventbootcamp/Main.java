package org.cventbootcamp;

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle(12345, 2020, "Toyota", "Corolla", "Sedan", "Blue", 500, 25000.00);
        Dealership myDealership = new Dealership("Miller Honda Dealership", "123 Main Street, New Town, Virginia, 20017", "123-456-7891");

        //Test the Setters (Vehicle Class)
        myVehicle.setVin(53423);
        myVehicle.setYear(2021);
        myVehicle.setMake("Jeep");
        myVehicle.setModel("Rangler");
        myVehicle.setVehicleType("Suv");
        myVehicle.setColor("Silver");
        myVehicle.setOdometer(6000);
        myVehicle.setPrice(27000.00);

        //Test the Getters (Vehicle Class)
        System.out.println(myVehicle.getVin());
        System.out.println(myVehicle.getYear());
        System.out.println(myVehicle.getMake());
        System.out.println(myVehicle.getModel());
        System.out.println(myVehicle.getVehicleType());
        System.out.println(myVehicle.getColor());
        System.out.println(myVehicle.getOdometer());
        System.out.println(myVehicle.getPrice());

        //Test out Add Vehicle
        myDealership.addVehicle(myVehicle);

        //Test the Setters (Dealership Class)
        myDealership.setName("The Land Rover Dealership");
        myDealership.setAddress("55 Main Street, New Town, Virginia, 20017");
        myDealership.setPhone("555-555-5555");

        //Test the Getters (Dealership Class)
        System.out.println("Get Name: " + myDealership.getName());
        System.out.println("Get Address: " + myDealership.getAddress());
        System.out.println("Get Phone Number: " + myDealership.getPhone());
        System.out.println("Get Vehicles by Price: " + myDealership.getVehiclesByPrice(20000.00, 10000.00));
        System.out.println("Get Vehicles by Make and Model: " + myDealership.getVehiclesByMakeModel("Honda", "Accord"));
        System.out.println("Get Vehicles by Color: " + myDealership.getVehiclesByColor("Blue"));
        System.out.println("Get Vehicles by Mileage: " + myDealership.getVehiclesByMileage(100, 1000));
        System.out.println("Get Vehicles by Type: " + myDealership.getVehiclesByType("Sedan"));
        System.out.println("Get All Vehicles " + myDealership.getAllVehicles());
    }
}