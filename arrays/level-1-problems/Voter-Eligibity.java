import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Voter eligibilty");
        int n = 10;
        
        int arr[]= new int[n];
        System.out.print("Enter the age in the array : ");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        
        for (int j = 0 ; j < n ; j++){
            if(arr[j] < 18){
                System.out.println(arr[j] + " years old : not eligible");
            }else{
                System.out.println(arr[j] + " years old : eligible");
            }
        }
        sc.close();
    }
}