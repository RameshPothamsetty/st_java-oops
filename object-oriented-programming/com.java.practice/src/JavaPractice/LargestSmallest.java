package JavaPractice;

import java.util.Scanner;

    public class LargestSmallest {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter N: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.print("Enter " + n + " elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Initialize with first element
            int largest = arr[0];
            int smallest = arr[0];

            // Traverse the array manually
            for (int i = 1; i < n; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }

            System.out.println("Largest: " + largest);
            System.out.println("Smallest: " + smallest);

            sc.close();
        }
    }

