import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check if the first number is the smallest of the three");
        
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        
        boolean small = (num1<num2)&&(num1<num3);

        System.out.print("Is the number "+ num1 +" smallest ? "+ small);
        sc.close();
    }
}