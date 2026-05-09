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

