package Problem_statement_2;

import java.util.Scanner;

public class Temperature_Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C)elsius or (F)ahrenheit? Enter C or F: ");
        char choice = sc.next().toUpperCase().charAt(0);

        if (choice == 'C') {
            double celsius = (temp - 32) * 5 / 9;
            System.out.println(temp + " Fahrenheit = " + celsius + " Celsius");
        } else if (choice == 'F') {
            double fahrenheit = (temp * 9 / 5) + 32;
            System.out.println(temp + " Celsius = " + fahrenheit + " Fahrenheit");
        } else {
            System.out.println("Invalid choice.");
        }
        sc.close();
    }
}