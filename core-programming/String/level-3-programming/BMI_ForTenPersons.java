import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];
        for (int i = 0; i < 10; i++) {
            hw[i][0] = sc.nextDouble();
            hw[i][1] = sc.nextDouble();
        }

        String[][] table = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = hw[i][0];
            double heightCm = hw[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";
            table[i][0] = String.valueOf(weight);
            table[i][1] = String.valueOf(heightCm);
            table[i][2] = String.format("%.2f", bmi);
            table[i][3] = status;
        }

        System.out.println("Weight\tHeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++)
            System.out.println(table[i][0] + "\t" + table[i][1] + "\t" + table[i][2] + "\t" + table[i][3]);
        sc.close();
    }
}
