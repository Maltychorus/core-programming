import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the power of a number");
        
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        
        System.out.print("Enter the power : ");
        int p = sc.nextInt();
        
        if (n < 0 || p < 0){
            System.out.print("Number and power are not postive integers");
        }else{
            int result = 1;
            for (int i = 1 ; i <= p ; i++){
                result = result * n;
            }
            System.out.print(n+" raised to the power "+p+" is "+result); 
        }
        sc.close();
    }
}