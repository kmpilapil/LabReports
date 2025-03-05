//Factorial.java
package Factorial;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a non-negative integer:");
            int num = scanner.nextInt();
            scanner.nextLine(); //consume leftover line to fix skipping issue

            FactorialCalculator fac = new FactorialCalculator(num);
            fac.displayResult();
            System.out.println("Would you like to try again? Y/N");
            String decision = scanner.nextLine();
            if (decision.equalsIgnoreCase("Y")) {
                continue;
            } else {
                break;
            }
        }
    }
}
