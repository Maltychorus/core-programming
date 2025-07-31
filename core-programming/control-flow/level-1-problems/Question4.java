import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check for natural number and compute sum");
        
        int n = sc.nextInt();
        
        if(n>=1){
            int sum = n*(n+1)/2;
            System.out.println("Sum of " + n + " natural numbers is " + sum);
        }else{
            System.out.println("The number " + n + " is not natural number");
        }
        sc.close();
    }
}