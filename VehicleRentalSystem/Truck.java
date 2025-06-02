package VehicleRentalSystem;

//SUBCLASS TRUCK
    public class Truck extends Vehicle {
       private double payloadCapacity;
        public Truck(String make, String model, double rentalPrice, double payloadCapacity){
                super(make, model, rentalPrice);
        this.payloadCapacity = payloadCapacity;
                }
        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Payload Capacity: " + payloadCapacity + " Tons");
        }
        @Override
    public double calculateDiscountedRentalCost(int rentalDays, double discountPercentage) {
        double baseDiscountedCost = super.calculateDiscountedRentalCost(rentalDays, discountPercentage);
        // Apply an additional 5% discount if rentalDays > 3
double totalDiscountPercentage = discountPercentage; // Start with the given discount
    if (rentalDays > 3) {
        totalDiscountPercentage += 5.0; // Add extra 5% discount
    }
     double finalDiscountAmount = (super.calculateRentalCost(rentalDays) * totalDiscountPercentage) / 100;
    double finalDiscountedCost = super.calculateRentalCost(rentalDays) - finalDiscountAmount;

    return finalDiscountedCost; // ✅ Return the final price after all discounts
        }
        @Override
        public void performMaintenance(){
            System.out.println("Checking payload systems and engine oil for the truck.");
        }
    }