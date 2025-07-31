import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mean height of 11 football players");
       
        double sum = 0.0;
        for(int i = 0 ; i < 11 ; i++){
            System.out.print("Enter the height of player " + (i+1) + " in cm : ");
            double height = sc.nextDouble();
            sum = sum + height;
        }
        
        double mean = sum / 11;
        System.out.print("Mean height : " + mean);
        sc.close();
    }
}