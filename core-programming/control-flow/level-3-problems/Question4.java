import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Armstrong number");
        
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        
        int sum = 0;
        int og = n;
        
        while(n!=0){
            int digit = n % 10;
            sum = sum + digit*digit*digit;
            n = n / 10;
        }
        if(sum == og){
            System.out.print(og + " is an armstrong number");
        }else{
            System.out.print(og + " is not an armstrong number");
        }
        sc.close();
    }
}