import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Greatest factor of number (n) (excluding the number itself) : ");
        int n = sc.nextInt();
        
        if(n <= 1){
            System.out.print("Not possible");
        }else{
            int i = n-1;
            while (i > 1){
                if(n % i == 0){
                    System.out.print("Shazam : "+ i);
                    break;
                }
                i--;
               
            }
        }
        sc.close();
    }
}