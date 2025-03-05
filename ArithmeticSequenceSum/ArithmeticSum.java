package ArithmeticSequenceSum;

//ArithmeticSum.java
public class ArithmeticSum {
    private int number;
    
    public ArithmeticSum (int number) {
this.number = number;
}
    //method to calculate sum
    public double calculateSum() {
        double sum = 0;
    for (int i = 1; i<=number; i++){
        sum += i;
    }
    return sum;
}
    //method to display sum
    public void displayResult(){
        System.out.println("The sum of the arithmetic sequence with " + number +"th term is " + calculateSum());
    }
}
