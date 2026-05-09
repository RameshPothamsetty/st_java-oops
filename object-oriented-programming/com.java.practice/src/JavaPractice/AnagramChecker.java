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

