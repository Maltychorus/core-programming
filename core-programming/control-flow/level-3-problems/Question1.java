import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Leap year (>=1582)");
        
        System.out.print("Enter a year after 1582 (including 1582) : ");
        int year = sc.nextInt();
        
        if(year < 1582){
            System.out.print("Greater than or equal to 1582 plez");
        }else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.print(year+" is a leap year");
        }else{
            System.out.print(year+" is not a leap year");
        }
        sc.close();
    }
}