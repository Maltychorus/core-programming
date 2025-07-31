import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Prime Number Check");
        
        System.out.print("Enter a number to check whether it is prime or not : ");
        int n = sc.nextInt();
        
        if(n<=1){
            System.out.print(n+" is not a prime number");
        }else{
            boolean isPrime = true;
            for (int i = 2 ; i < n ; i++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(n + " is a prime number");
            }else{
                System.out.print(n + " is not a prime number");
            }
        }
        sc.close();
    }
}