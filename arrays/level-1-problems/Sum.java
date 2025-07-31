import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 positive numbers ; Enter 0 ot negative number to stop");
        
        double arr[] = new double[10];
        int i = 0;
        
        while(true){
            System.out.print("Enter number "+ (i+1) + " : ");
            double input = sc.nextDouble();
            
            if(input <= 0 ){
                break;
            }
            if(i == 10){
                break;
            }
            
            arr[i] = input;
            i++;
        }
        
        System.out.print("Entered numbers : ");
        double sum = 0.0;
        for (int j = 0 ; j < i ; j++){
            System.out.println("Number " + j+1 + " : " + arr[j]);
            sum = sum + arr[j];
        }
        
        System.out.print("Sum : " + sum);
        sc.close();
    }
}