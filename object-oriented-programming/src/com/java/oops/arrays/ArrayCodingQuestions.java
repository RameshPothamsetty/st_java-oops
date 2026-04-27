package com.java.oops.arrays;

import java.util.Arrays;

public class ArrayCodingQuestions {
    public static int findHighestPrice(int [] productPrices){
        int highest = productPrices[0];

        for (int i=1; i< productPrices.length;i++){
            if(productPrices[i]> highest) {
                highest= productPrices[i];
            }
        }

        return highest;


        }


        public static int[] sortInAscendingOrder(int[] productPrices) {
            // Outer loop: move the boundary of the unsorted subarray
            for (int i = 0; i < productPrices.length - 1; i++) {

                int smallestIndex = i; // Assume the current position is the smallest

                // Inner loop: find the smallest element in the remaining unsorted array
                for (int j = i + 1; j < productPrices.length; j++) {
                    if (productPrices[j] < productPrices[smallestIndex]) {
                        smallestIndex = j; // Found a new smallest, save its position
                    }
                }

                // Swap the found minimum element with the first element of the unsorted part
                int temp = productPrices[smallestIndex];
                productPrices[smallestIndex] = productPrices[i];
                productPrices[i] = temp;
            }

            return productPrices;

        }

        public static void main(String[] args) {
            int[] productPrices = {1000, 20, 30, 400, 50};

            int[] sortedPrices = sortInAscendingOrder(productPrices);

            // Use Arrays.toString() to print the actual contents of the array
            System.out.println(Arrays.toString(sortedPrices));
        }
    }


