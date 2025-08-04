import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for(int i = 0; i < 10; i++) {
            System.out.println("Enter salary for employee " + (i+1) + ":");
            double s = sc.nextDouble();
            System.out.println("Enter years of service for employee " + (i+1) + ":");
            double y = sc.nextDouble();
            
            if(s <= 0 || y < 0) {
                System.out.println("Invalid input! Enter again.");;
            }
            salary[i] = s;
            years[i] = y;
        }

        for(int i = 0; i < 10; i++) {
            bonus[i] = (years[i] > 5) ? (0.05 * salary[i]) : (0.02 * salary[i]);
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\n=== Employee Bonus Details ===");
        for(int i = 0; i < 10; i++) {
            System.out.printf("Employee %d: Old Salary=%.2f, Bonus=%.2f, New Salary=%.2f%n",
                              i+1, salary[i], bonus[i], newSalary[i]);
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        sc.close();
    }
}
