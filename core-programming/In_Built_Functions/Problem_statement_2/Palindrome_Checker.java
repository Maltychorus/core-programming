package Problem_statement_2;
import java.util.Scanner;
public class Palindrome_Checker {
    static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println(input + (isPalindrome(input) ? " is a Palindrome" : " is Not a Palindrome"));
        sc.close();
    }
}
