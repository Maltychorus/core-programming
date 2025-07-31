import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("odd or even");
        
        System.out.print("Enter a natural number : ");
        int n = sc.nextInt();
        
        if(n<0){
            System.out.print("Forget about it");
        }else{
            System.out.print("Odd and even numbers from 1 to "+n+" :" );
            for (int i = 1; i<=n;i++){
                if(i%2==0){
                    System.out.println("Even number : "+i);
                }else{
                    System.out.println("Odd number : "+i);
                }
            }
        }
        sc.close();
    }
}