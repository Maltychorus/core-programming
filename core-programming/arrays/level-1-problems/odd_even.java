import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Odd and Even Numbers Separated into Arrays");
        
        System.out.print("Enter the natural number : ");
        int n = sc.nextInt();
        
        if (n <= 0){
            System.out.print("Enter the natural number");
        } 
        
        int odd[] = new int[(n/2)+1];
        int even[] = new int[(n/2)+1];
        
        int oddindex = 0;
        int evenindex = 0;
        
        for (int i = 1 ; i <= n ; i++){
            if (i % 2 == 0){
                odd[oddindex++] = i;
            }else{
                even[evenindex++] = i;
            }
        }
        System.out.print("Odd numbers : ");    
        for (int i = 0 ; i < oddindex ; i++){
            System.out.print(odd[i] + " ");
        }
        System.out.println();
        System.out.print("Even numbers : ");
        for (int j = 0 ; j < evenindex ; j++){
            System.out.print(even[j] + " ");
        }
        sc.close();
    }
}