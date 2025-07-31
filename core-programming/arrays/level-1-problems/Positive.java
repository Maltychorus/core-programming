import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        System.out.println("Number of elements in the array : "+n);
        
        int arr[] = new int[n];
        System.out.print("Elements in an array : ");
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        
        for (int j = 0 ; j < n ; j++){
            if (arr[j] < 0){
                System.out.println(arr[j] + " is negative");
            }else if (arr[j] == 0){
                System.out.println(arr[j]);
            }else{
                System.out.println(arr[j] + " is positive");
            }
        }
        
        int k = 0;
        while(k<=4){
            if(arr[k] % 2 == 0){
                System.out.println(arr[k] + " is even");
            }else{
                System.out.println(arr[k] + " is odd");
            }
            k++;
        }
        
        if (arr[0] > arr[4]){
            System.out.print(arr[0] + " > "+ arr[4]);
        }else if (arr[0] == arr[4]){
            System.out.print(arr[0] + " = " + arr[4]);
        }else {
            System.out.print(arr[0] + " < " + arr[4]);
        }
        
        sc.close();
    }
}