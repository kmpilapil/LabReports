//FactorialCalculator.java
package Factorial;
public class FactorialCalculator {
    private int number;
    //contstructor
    public FactorialCalculator(int number) {
        this.number = number;
    }
    //method to calculate factorial
    public long calculateFactorial(){
    long factorial = 1;
    for (int i = 1; i <= number; i++) {
        factorial *= i;
    }
    return factorial;
}
    public void displayResult(){
        System.out.println ("Factorial of " + number + " is: " + calculateFactorial());
    }
}
