import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Count digits in a number : ");
        int n = sc.nextInt();
        int og = n;
        int count = 0;
        
        if(n == 0){
            count = 1;
        }else{
            while(n != 0){
                n = n / 10;
                count++;
            }
        }
        System.out.print(og + " has " + count + " digits");
        sc.close();
    }
}