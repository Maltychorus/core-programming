import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("check whether a number is positive, negative, or zero");
        
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        
        if (number > 0){
            System.out.print("Number is positive");
        }
        else if (number < 0){
            System.out.print("Number is negative");
        }
        else{
            System.out.print("Zero");
        }
        
        sc.close();
    }
}