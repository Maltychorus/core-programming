import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Power of a number (using while loop)");
        
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        
        System.out.print("Enter the power : ");
        int p = sc.nextInt();
        
        if(n <= 0 || p <= 0){
            System.out.print("Power and number are not positive");
        }else{
            int i = 1;
            int result = 1;
            while(i <= p){
                result = result * n;
                i++;
            }
            System.out.print("Number "+n+" raised to the power "+p+" is "+result);
        }
        sc.close();
    }
}