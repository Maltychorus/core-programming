import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("calculate the bonus for employees");
        
        System.out.print("Salary : ");
        double Salary = sc.nextInt();
        
        System.out.println("Years in service : ");
        double service = sc.nextInt();
        
        if (service > 5){
            double bonus = 0.05 * Salary;
            System.out.print("Eligile for bonus : Rs "+bonus);
        }else{
            System.out.print("Not eligible");
        }
        sc.close();
    }
}