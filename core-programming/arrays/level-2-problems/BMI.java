import java.util.Scanner;

class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; 
        String[] weightStatus = new String[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            double w = sc.nextDouble();
            System.out.print("Enter height (m) for person " + (i+1) + ": ");
            double h = sc.nextDouble();

            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h*h);

            double bmi = personData[i][2];
            if(bmi < 18.5) weightStatus[i] = "Underweight";
            else if(bmi < 25) weightStatus[i] = "Normal";
            else if(bmi < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("\nHeight | Weight | BMI | Status");
        for(int i = 0; i < n; i++) {
            System.out.printf("%.2f | %.2f | %.2f | %s%n", 
                              personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
        
        sc.close();
    }
}
