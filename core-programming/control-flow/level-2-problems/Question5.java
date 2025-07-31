import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fizzbuzz problem");
        
        System.out.print("Enter the positive number : ");
        int n = sc.nextInt();
        
        if(n < 0){
            System.out.print(n+" not a positive number.");
        }else{
            System.out.println("Fizzbuzz from 1 to "+n);
            int i = 1;
            while(i <= n){
                if ((i%3==0)&&(i%5==0)){
                    System.out.println("FizzBuzz");
                }else if(i%3==0){
                    System.out.println("Fizz");
                }else if(i%5==0){
                    System.out.println("Buzz");
                }else{
                    System.out.println(i);
                }
                i++;
            }
        }
        sc.close();
    }
}