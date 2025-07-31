import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("multiples of a user-entered number below 100");
        System.out.print("Enter a number (n) : ");
        int n = sc.nextInt();
        
        if(n <= 0 || n >= 100){
            System.out.print("Enter a number between 1 to 99");
        }else{
            for (int i = 1 ; i < 100 ; i++){
                if (i % n == 0){
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}