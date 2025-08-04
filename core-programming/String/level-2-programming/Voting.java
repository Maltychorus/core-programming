import java.util.Scanner;
import java.util.Random;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n = 10;
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = rand.nextInt(90) + 10; 

        String[][] result = new String[n][2];
        for (int i = 0; i < n; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "true" : "false";
        }

        System.out.println("Age\tCanVote");
        for (int i = 0; i < n; i++) System.out.println(result[i][0] + "\t" + result[i][1]);

        sc.close();
    }
}
