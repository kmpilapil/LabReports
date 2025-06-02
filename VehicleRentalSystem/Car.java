package VehicleRentalSystem;

//SUBCLASS CAR
    public class Car extends Vehicle {//extends vehicle
       private int numberofDoors;
        public Car(String make, String model, double rentalPrice, int numberofDoors){
            super(make, model, rentalPrice); // super to access superclass
            this.numberofDoors = numberofDoors;  //adds number of doors
        }
        @Override //like super, calls a method of a superclass but redefines it
        public void displayDetails() {
            super.displayDetails(); //calls the same details from superclass
            System.out.println("Number of Doors: " + numberofDoors); //adds another detail
        }
        @Override
        public void performMaintenance(){
            System.out.println("Performing general maintenance");
        }
    }
