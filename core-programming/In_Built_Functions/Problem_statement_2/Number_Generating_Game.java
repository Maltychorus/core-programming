package Problem_statement_2;

import java.util.*;

class Main {
    static Random rand = new Random();
    
    public static int generateGuess(int low, int high) {
        return rand.nextInt(high - low + 1) + low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        boolean correct = false;

        System.out.println("Think of a number between 1 and 100. I will try to guess it!");

        while (!correct) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            String feedback = sc.next().toLowerCase();

            switch (feedback) {
                case "high": high = guess - 1; break;
                case "low": low = guess + 1; break;
                case "correct": correct = true; break;
                default: System.out.println("Invalid input, type high/low/correct.");
            }
        }
        System.out.println("Yay! I guessed your number.");
        sc.close();
    }

    public static Random getRand() {
        return rand;
    }

    public static void setRand(Random rand) {
        Main.rand = rand;
    }
}
