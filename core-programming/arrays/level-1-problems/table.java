import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find it's multiples upto 10 : ");
        int n = sc.nextInt();
        
        int arr[] = new int[10];
        for (int i = 0 ; i < 10 ; i++){
            arr[i] = n * (i+1);
        }
        
        System.out.println("Multiplication table of " + n + " : ");
        
        for (int i = 0 ; i < 10 ; i++){
            System.out.println(n + " * " + (i + 1) + " = " + arr[i]);
        }
        
        sc.close();
    }
}