package VehicleRentalSystem;

public class Main {
    public static void main(String[] args) {
        // Create an array of Vehicle objects demonstrating polymorphism
        Vehicle[] vehicles = new Vehicle[4];
        
        vehicles[0] = new Car("Toyota", "Camry", 50.0, 4);
        vehicles[1] = new Truck("Ford", "F-150", 80.0, 2.5);
        vehicles[2] = new Motorcycle("Harley-Davidson", "Street 750", 40.0, true);
        vehicles[3] = new ElectricCar("Tesla", "Model S", 50.0, 100.0);
        
        
        // Loop through each vehicle and display its details and rental cost
        for (Vehicle v : vehicles) {
            v.displayDetails();
            v.AdditionalInfo();
            v.performMaintenance();
            System.out.println("-----------------------------"); 
}
    }
}
