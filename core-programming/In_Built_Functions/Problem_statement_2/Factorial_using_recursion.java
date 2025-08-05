package Problem_statement_2;
import java.util.Scanner;

public class Factorial_using_recursion {
    
    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Factorial of " + number + " is: " + factorial(number));
        sc.close();
    }
} 