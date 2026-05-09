package JavaPractice;

import java.util.Scanner;

        public class Factorial {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter N: ");
            int n = sc.nextInt();

            if (n < 0) {
                System.out.println("Error: Factorial is not defined for negative numbers.");
            } else {
                long factorial = 1;
                for (int i = 2; i <= n; i++) {
                    factorial *= i;
                }
                System.out.println("Factorial of " + n + " = " + factorial);
            }
            sc.close();
        }
    }


