import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("factorial of a number using while loop");
        
        System.out.print("Enter a positive number : ");
        int n = sc.nextInt();
        
        if(n<0){
            System.out.print("Factorial is not defined for negative numbers.");
        }else{
            int i = 1;
            int factorial = 1;
            while(i<=n){
                factorial = factorial*i;
                i++;
            }
            System.out.print("Factorial of number "+n+" is "+factorial);
        }
        sc.close();
    }
}