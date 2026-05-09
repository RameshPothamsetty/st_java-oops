CODING PROBLEMS

1.Problem Statement: 
Reverse a without using built in  reverse methods and use loops to reverse  a String 
Code:
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
    String str = sc.nextLine();
    String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
        rev += str.charAt(i);
    }

        System.out.println("Reversed: " + rev);
        sc.close();


    }
}













2.Count vowels and Consonants
Write a java program that accepts a string and counts the number of vowels and consonants ignore digits and special characters
Sample Input: java Programming Language 
Expected Output:Vowels:6 Consonants : 9
CODE:
package JavaPractice;

import java.util.Scanner;

public class VowelConsonantCounter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {          // ignore non-letters
                char lower = Character.toLowerCase(ch);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels + " Consonants: " + consonants);
        sc.close();
    }
}






3. Factorial Using Recursion
 Write a java program that computes the factorial of a non-negative integer N using Handle the base cases N =0 and N=1(both return 1) . If N<0 print an error message 
Sample Input : Enter N :6
Expected Output : Factorial of 6 =720
Code:
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










4. Check  a number is Prime
Write  a java program that reads an integer 
package JavaPractice;


    import java.util.Scanner;

     public class PrimeNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            boolean isPrime = true;

            if (n <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime)
                System.out.println(n + " is a prime number.");
            else
                System.out.println(n + " is not a prime number.");

            sc.close();
        }
    }







5.FizzBuzz
Write a java program that prints numbers from 1 to 50 . For multiples of 3 print “Fizz” instead of the number .For multiples of 5,print “Buzz”, For multiples of both 3 and 5 ,Print “FizzBuzz”
 Sample output(partial)
1 2 Fizz 4 Buzz Fizz …
Expected Output:
FizzBuzz
Code:
package JavaPractice;

public class FizzBuzz {

        public static void main(String[] args) {
            for (int i = 1; i <= 50; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("FizzBuzz ");
                } else if (i % 3 == 0) {
                    System.out.print("Fizz ");
                } else if (i % 5 == 0) {
                    System.out.print("Buzz ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }










6.Sum of Digits 
Write a java program that reads a positive integer and computes  the sum of its digits .For example 1234- 1+2+3+4 =10 . Do Not convert the number to a String . Use arithmetic only
Sample Input:9675
Expected Output:
Sum of the digits = 27

CODE:
package JavaPractice;

import java.util.Scanner;

public class SumOfDigits { 
public static void main(String[] args) {
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



 
7.Find Largest and Smallest in an Array
Write a java program that reads N integers from the user into an array and prints the largest and smallest values, Do Not use Arrays.sort() or any sorting method .Traverse the array manually
Sample Input :N =5, Elements: 3 17 -2 8 11 
Expected Output: Largest :17 Smallest :-2
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

8. Palindrome Checker (Ignore Spaces & Case) 
Write a Java program that reads a phrase from the user and checks if it is a palindrome. Before checking, remove all spaces and convert to lowercase. Do NOT use StringBuilder.reverse(). Compare characters manually using two pointers.
Sample Input
A man a plan a canal Panama
Expected Output
It is a palindrome!
Code:
package JavaPractice;


    import java.util.Scanner;

    public class PalindromeChecker {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a phrase:");
            String input = sc.nextLine();

            // Remove spaces and convert to lowercase
            String cleaned = input.replaceAll("\\s+", "").toLowerCase();

            boolean isPalindrome = true;
            int left = 0;
            int right = cleaned.length() - 1;

            // Two-pointer comparison
            while (left < right) {
                if (cleaned.charAt(left) != cleaned.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (isPalindrome) {
                System.out.println("It is a palindrome!");
            } else {
                System.out.println("It is not a palindrome.");
            }

            sc.close();
        }
    }
9. Stack Using Array (Push, Pop, Peek)
Implement a Stack data structure using a plain integer array (no Java Stack or Deque classes). Your Stack class must support: push(int x), pop() (returns top and removes it), peek() (returns top without removing), isEmpty(), and isFull(). In main(), demonstrate: push 5 elements, peek, pop 3 elements, print current stack state.
No user input required
(program-driven)
Expected Output
Pushed: 10 20 30 40 50 | Peek: 50 | Popped: 50 40 30 | Stack: [10, 20]

Code:
package JavaPractice;


    class Stack {
        private int[] arr;
        private int top;
        private int capacity;

        // Constructor
        public Stack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        // Push element onto stack
        public void push(int x) {
            if (isFull()) {
                System.out.println("Stack Overflow! Cannot push " + x);
                return;
            }
            arr[++top] = x;
        }

        // Pop element from stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow!");
                return -1;
            }
            return arr[top--];
        }

        // Peek top element without removing
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return arr[top];
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return top == -1;
        }

        // Check if stack is full
        public boolean isFull() {
            return top == capacity - 1;
        }

        // Utility method to print current stack (for demonstration)
        public void printStack() {
            System.out.print("Stack: [");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i]);
                if (i < top) System.out.print(", ");
            }
            System.out.print("]");
        }
    }

    public class StackDemo {
        public static void main(String[] args) {
            Stack stack = new Stack(5); // capacity 5

            // Push 5 elements
            int[] elements = {10, 20, 30, 40, 50};
            System.out.print("Pushed: ");
            for (int e : elements) {
                stack.push(e);
                System.out.print(e + " ");
            }

            // Peek
            System.out.print("| Peek: " + stack.peek());

            // Pop 3 elements
            System.out.print(" | Popped: ");
            for (int i = 0; i < 3; i++) {
                System.out.print(stack.pop() + " ");
            }

            // Print current stack state
            System.out.print("| ");
            stack.printStack();
        }
    }

10. Anagram Checker :
Write a Java program that reads two words from the user and checks if they are anagrams. Two words are anagrams if they contain the same characters in any order (case-insensitive). Use a frequency-count array of size 26. Do NOT sort the strings. Ignore spaces if present.
Sample Input
Word1: listen
Word2: silent
Expected Output
listen and silent are Anagrams!
Code:

package JavaPractice;

 import java.util.Scanner;

public class AnagramChecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Word1: ");
        String original1 = sc.nextLine();
        System.out.print("Word2: ");
        String original2 = sc.nextLine();

        // Prepare strings: remove spaces, to lowercase
        String clean1 = original1.replaceAll("\\s+", "").toLowerCase();
        String clean2 = original2.replaceAll("\\s+", "").toLowerCase();

        boolean isAnagram = true;

        if (clean1.length() != clean2.length()) {
            isAnagram = false;
        } else {
            int[] freq = new int[26];
            for (int i = 0; i < clean1.length(); i++) {
                freq[clean1.charAt(i) - 'a']++;
            }
            for (int i = 0; i < clean2.length(); i++) {
                freq[clean2.charAt(i) - 'a']--;
            }
            for (int count : freq) {
                if (count != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }

        if (isAnagram) {
            System.out.println(original1 + " and " + original2 + " are Anagrams!");
        } else {
            System.out.println(original1 + " and " + original2 + " are not Anagrams!");
        }

        sc.close();
    }
}

 11. Linked List — Insert, Delete, Reverse, and Print.
 Implement a singly Linked List from scratch (no Java LinkedList class). Your implementation must support all four operations listed below. In main(), insert {1, 2, 3, 4, 5}, delete 3, reverse the list, and print the result at each step
. • insertAtEnd(int data) — appends a node at the end • deleteByValue(int data) — removes the first node with the given value • reverse() — reverses the entire list in-place • printList() — prints all values space-separated
 No user input required (program-driven) 
Expected Output After insert: 1 2 3 4 5 After delete 3: 1 2 4 5 After reverse: 5 4 2 1 Write your answer below:

Code:
package JavaPractice;


    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedList {
        Node head;

        // Insert at end
        void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        // Delete first node with given value
        void deleteByValue(int data) {
            if (head == null) return;

            // If head node itself holds the value
            if (head.data == data) {
                head = head.next;
                return;
            }

            Node current = head;
            while (current.next != null && current.next.data != data) {
                current = current.next;
            }

            if (current.next != null) {
                current.next = current.next.next;
            }
        }

        // Reverse the list in-place
        void reverse() {
            Node prev = null;
            Node current = head;
            Node next = null;

            while (current != null) {
                next = current.next; // store next node
                current.next = prev; // reverse link
                prev = current;      // move prev forward
                current = next;      // move current forward
            }
            head = prev; // new head
        }

        // Print all values space-separated
        void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public class Main {
        public static void main(String[] args) {
            LinkedList list = new LinkedList();

            // Insert 1,2,3,4,5
            System.out.print("After insert: ");
            for (int i = 1; i <= 5; i++) {
                list.insertAtEnd(i);
            }
            list.printList(); // 1 2 3 4 5

            // Delete 3
            list.deleteByValue(3);
            System.out.print("After delete 3: ");
            list.printList(); // 1 2 4 5

            // Reverse
            list.reverse();
            System.out.print("After reverse: ");
            list.printList(); // 5 4 2 1
        }
    }

12. Matrix Multiplication :
Write a Java program that multiplies two matrices A (M×N) and B (N×P) and stores the result in C (M×P). Read both matrices from the user. Validate that the number of columns of A equals the number of rows of B — if not, print an error. Otherwise compute and print matrix C row by row. Do NOT use any external library. Use nested loops only. • Validate dimensions before multiplying • Implement using three nested for-loops 
Sample Input A = [[1,2],[3,4]] B = [[5,6],[7,8]] 
Expected Output C = 19 22 43 50
Code:
package JavaPractice;
import java.util.Scanner;
public class MatrixMultiplication {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Read dimensions of matrix A
            System.out.print("Enter rows and columns of matrix A (M N): ");
            int M = sc.nextInt();
            int N = sc.nextInt();

            // Read dimensions of matrix B
            System.out.print("Enter rows and columns of matrix B (N P): ");
            int N2 = sc.nextInt();
            int P = sc.nextInt();

            // Validate: columns of A must equal rows of B
            if (N != N2) {
                System.out.println("Error: Number of columns of A (" + N +
                        ") does not equal number of rows of B (" + N2 + ")");
                sc.close();
                return;
            }

            // Initialize matrices
            int[][] A = new int[M][N];
            int[][] B = new int[N][P];
            int[][] C = new int[M][P];

            // Read matrix A
            System.out.println("Enter matrix A (" + M + "x" + N + "):");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    A[i][j] = sc.nextInt();
                }
            }

            // Read matrix B
            System.out.println("Enter matrix B (" + N + "x" + P + "):");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < P; j++) {
                    B[i][j] = sc.nextInt();
                }
            }

            // Matrix multiplication: C = A * B
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < P; j++) {
                    int sum = 0;
                    for (int k = 0; k < N; k++) {
                        sum += A[i][k] * B[k][j];
                    }
                    C[i][j] = sum;
                }
            }

            // Print result matrix C row by row
            System.out.println("C =");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < P; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }

            sc.close();
        }
    }

