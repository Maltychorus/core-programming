import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Factors of a number (n) : ");
        
        int n = sc.nextInt();
        
        if (n < 1){
            System.out.print("Number is not positive integer");
        }else{
            for (int i = 1 ; i <= n ; i++){
                if (n % i == 0){
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}