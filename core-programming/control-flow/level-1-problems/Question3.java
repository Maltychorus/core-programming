import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check which number is the largest among three");
        
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        
        boolean firstislargest = (num1>num2)&&(num1>num3);
        boolean secondislargest = (num2>num1)&&(num2>num3);
        boolean thirdislargest = (num3>num2)&&(num3>num1);
        
        System.out.println("Is the first number "+num1+" largest ? "+ firstislargest);
        System.out.println("Is the second number "+num2+" largest ? "+ secondislargest);
        System.out.println("Is the third number "+num3+" largest ? "+ thirdislargest);
        sc.close();
    }
}