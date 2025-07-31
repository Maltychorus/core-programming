import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BMI calculator");
        
        System.out.print("Enter weight (kg) : ");
        double w = sc.nextDouble();
        
        System.out.print("Enter height (cm) : ");
        double h = sc.nextDouble();
        
        h = h/100;
        
        double bmi = w / (h*h);
        
        if (bmi <= 18.9){
            System.out.print("Underweight");
        }else if (bmi <= 24.9){
            System.out.print("Normal");
        }else if (bmi <= 39.9){
            System.out.print("Overweight");
        }else{
            System.out.print("Obese");
        }
        sc.close();
    }
}