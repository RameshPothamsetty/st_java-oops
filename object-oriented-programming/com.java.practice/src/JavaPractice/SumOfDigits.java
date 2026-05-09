package JavaPractice;

import java.util.Scanner;

public class SumOfDigits { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int num = sc.nextInt();

    int sum = 0;
    int temp = num;

    while (temp > 0) {
        sum += temp % 10;   // add last digit to sum
        temp /= 10;         // remove last digit
    }

    System.out.println("Sum of the digits = " + sum);
    sc.close();
}
}



