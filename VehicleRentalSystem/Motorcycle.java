package VehicleRentalSystem;

//SUBCLASS MOTORCYCLE
    public class Motorcycle extends Vehicle {
        private boolean helmet;
        public Motorcycle(String make, String model, double rentalPrice, boolean helmet){
            super(make, model, rentalPrice);
            this.helmet = helmet;
        }
        @Override
        public void displayDetails(){
            super.displayDetails();
            System.out.println ("Rented a Helmet: " + (helmet ? "Yes" : "No"));
        }
        @Override
        public void performMaintenance(){
            System.out.println("Inspecting brakes and tire pressure for the motorcycle.");
        }
    }