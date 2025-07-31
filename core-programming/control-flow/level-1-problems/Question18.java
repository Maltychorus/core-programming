import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("print the multiplication table of a number from 6 to 9");
        
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        
        for (int i = 6 ; i <= 9 ; i++){
            System.out.println(i*number);
        }
        sc.close();
    }
}