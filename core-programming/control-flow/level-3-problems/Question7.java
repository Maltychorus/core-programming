import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Harshad Number (a number divisible by the sum of its digits)");
        
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        
        int sum = 0;
        int og = n;
        
        while(n != 0){
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        
        if (og % sum == 0){
            System.out.print(og + " is a Harshad number");
        }else{
            System.out.print(og + " is not a Harshad number");
        }
        
        sc.close();
    }
}