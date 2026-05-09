package com.java.oops.exceptionhandling;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("enter a number :");
                int number1 = sc.nextInt();
                System.out.println("enter a number :");
                int number2 = sc.nextInt();
                int number=number1/number2;

            }catch(ArithmeticException e){
                System.out.println("This is not going to work");
                System.out.println(e.getMessage());

                try{

                    System.out.println("enter a array value :");
                   int [] i = new int [10];
                   Scanner sc = new Scanner(System.in);
                   int i1=sc.nextInt();



                }
                catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsExceptione){
                    System.out.println("This is not going to work");
                    System.out.println(e.getMessage());


                }
            }







    }
}
