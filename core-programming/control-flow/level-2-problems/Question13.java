import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("multiples of a number below 100 using a while loop");
        
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        
        if (n <= 0 || n >= 100){
            System.out.print("Enter a number between 1 to 99");
        }else{
            int i = 1;
            while(i < 100){
                if (i % n == 0){
                    System.out.println(i);
                }
                i++;
            }
        }
        sc.close();
    }
}