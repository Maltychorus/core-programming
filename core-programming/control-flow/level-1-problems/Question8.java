import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("countdown for a rocket launch");
        
        System.out.print("Count down starts : ");
        int n = sc.nextInt();
        
        while(n >= 1){
            System.out.println(n);
            n--;
        }
        
        System.out.print("Launch");
        sc.close();
    }
}