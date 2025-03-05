package ArithmeticSequenceSum;

import java.util.Scanner;


public class ArithmeticSumTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println ("Please enter a positive integer");
            int num = scanner.nextInt();
            scanner.nextLine();
            if (num < 0){
                System.out.println("Error.");
                continue;
            }
            
            ArithmeticSum sum = new ArithmeticSum(num);
            sum.displayResult();
            System.out.println("Would you like to try again? Y/N");
            String decision = scanner.nextLine();
            if (decision.equalsIgnoreCase("Y")){
                continue;}
            else {break;}
            }
        }
    }

