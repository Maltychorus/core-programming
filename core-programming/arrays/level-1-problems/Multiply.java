import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("multiplication results from 6 to 9 ");
        
        System.out.print("Enter a number to be multiplied : ");
        int n = sc.nextInt();
        
        int arr[] = new int[4];
        
        // store 6 to 9 in the array [6 , 7 , 8 , 9]
         
        for(int i = 0 ; i < 4 ; i++){
            int multiplier = i + 6;
            arr[i] = n * multiplier;
        }
        
        for (int i = 0 ; i < 4 ; i++){
            int multiplier = 6 + i;
            System.out.println(n + " * " + multiplier + " = " + arr[i]);
        }
        
        sc.close();
    }
}