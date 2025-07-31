import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("finds the sum of numbers until the user enters 0");
        
        double value = sc.nextDouble();
        double sum = 0.0;
        
        while(value != 0){
            sum = sum + value;
            System.out.print("Enter a number (0 to stop) : ");
            value = sc.nextDouble();
        }
        
        System.out.print("Total sum " + sum);
        
        sc.close();
    }
}