import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for(int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ":");
            ages[i] = sc.nextInt();
            System.out.println("Enter height of " + names[i] + " in cm:");
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        int minAge = ages[0];
        for(int i = 1; i < 3; i++) {
            if(ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }
        }

        int tallestIndex = 0;
        double maxHeight = heights[0];
        for(int i = 1; i < 3; i++) {
            if(heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }

        System.out.println("Youngest: " + names[youngestIndex] + " (Age " + minAge + ")");
        System.out.println("Tallest: " + names[tallestIndex] + " (Height " + maxHeight + " cm)");
        
        sc.close();
    }
}
