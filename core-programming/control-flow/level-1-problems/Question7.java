import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Spring Season (March 20 to June 20)");
        
        System.out.print("Enter the month (1 to 12) : ");
        int month = sc.nextInt();
        
        System.out.print("Enter the date accordingly : ");
        int date = sc.nextInt();
        
        boolean ispring = (month == 3 && date >= 20)||(month==4)||(month==5)||(month == 6 && date <= 20);
        
        if (ispring){
            System.out.print("Spring season");
        }else{
            System.out.print("Nah");
        }
        sc.close();
    }
}