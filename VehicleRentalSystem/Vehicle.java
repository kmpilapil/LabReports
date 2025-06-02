
package VehicleRentalSystem;

public abstract class Vehicle {
    private  String make;
    private  String model;
    private  double rentalPrice;
    //SUPERCLASS
    public Vehicle (String make, String model, double rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }
    public void displayDetails() { //vehicle details
        String info = String.format(
       "Vehicle details: %n"
            + "Make: %s %n"
            + "Model: %s %n"
            + "Rental Price per Day: $%.2f %n"
            + "Rental Cost for %d Days: $%.2f %n"
                + "Discounted Price (%.0f%%): $%.2f", //discounted price(50%): 'price'
            make, model, rentalPrice, rentalDays, calculateRentalCost(rentalDays),discountPercentage,
            calculateDiscountedRentalCost(rentalDays, discountPercentage));
        System.out.println(info);
    }
int rentalDays = 14;
double discountPercentage = 10.0; // Default no discount


    public double calculateRentalCost(int rentalDays) {
        return rentalPrice * rentalDays;
    }
   public double calculateDiscountedRentalCost(int days, double discountPercentage){
       double totalCost = rentalDays * rentalPrice;
        double discountAmount = (totalCost * discountPercentage) / 100; // Apply discount
        return totalCost - discountAmount; // Return final price after discount
   }
public void AdditionalInfo(){ //for additional info methods for each vehicle e.g. Electric Car Battery Capacity
    
}
    //abstract method to force subclass to define
    public abstract void performMaintenance();
}


