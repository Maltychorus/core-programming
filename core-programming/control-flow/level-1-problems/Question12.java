import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Compare sum of n number using while loop and n*(n+1)/2 formula");
        
        System.out.print("Enter the natural number : ");
        int n = sc.nextInt();
        
        if (n<1){
            System.out.print(n+" is not natural number");
        }else{
            int i =1 ;
            int whilesum = 0;
            while( i <= n){
                whilesum=whilesum+i;
                i++;
            }
            
            int sum = n*(n+1)/2;
            
            System.out.println("Sum using for loop : "+whilesum);
            System.out.println("Sum using formula : "+sum);
            
            if(sum==whilesum){
                System.out.print("Computatuon successful");
            }else{
                System.out.print("wrong");
            }
        }
        
        sc.close();
    }
}