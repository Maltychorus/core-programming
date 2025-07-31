import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check if person can vote");
        
        int age = sc.nextInt();
        
        if(age>=18){
            System.out.print("Can vote");
        }else{
            System.out.print("Nah");
        }
        sc.close();
    }
}