import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] phy = new int[n], chem = new int[n], math = new int[n];
        double[] perc = new double[n];
        char[] grade = new char[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Physics marks for student " + (i+1) + ": ");
            phy[i] = sc.nextInt();
            System.out.print("Chemistry marks: ");
            chem[i] = sc.nextInt();
            System.out.print("Math marks: ");
            math[i] = sc.nextInt();

            perc[i] = (phy[i] + chem[i] + math[i]) / 3.0;
            if(perc[i] >= 90) grade[i] = 'A';
            else if(perc[i] >= 75) grade[i] = 'B';
            else if(perc[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }

        System.out.println("\nPhy | Chem | Math | % | Grade");
        for(int i = 0; i < n; i++) {
            System.out.printf("%d | %d | %d | %.2f | %c%n", phy[i], chem[i], math[i], perc[i], grade[i]);
        }
        
        sc.close();
    }
}
