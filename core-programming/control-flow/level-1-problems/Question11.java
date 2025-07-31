import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("finds the sum of numbers until the user enters 0 (using while loop)");
        
        double sum = 0.0;
        
        while(true){
            System.out.print("Enter the number (0 or negative to stop) : ");
            double value = sc.nextDouble();
            
            if(value <= 0){
                break;
            } 
            
            sum = sum + value;
        }
        System.out.print("Total sum "+ sum);
        sc.close();
    }
}