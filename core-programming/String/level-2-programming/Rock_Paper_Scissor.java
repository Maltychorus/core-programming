import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] choices = {"rock","paper","scissors"};
        int playerWins = 0, compWins = 0;
        
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        
        for (int g = 1; g <= games; g++) {
            System.out.print("Enter rock/paper/scissors: ");
            String player = sc.next().toLowerCase();
            String computer = choices[(int)(Math.random()*3)];
            
            System.out.println("Computer: " + computer);
            if (player.equals(computer)) System.out.println("Draw");
            else if (
                (player.equals("rock") && computer.equals("scissors")) ||
                (player.equals("paper") && computer.equals("rock")) ||
                (player.equals("scissors") && computer.equals("paper"))
            ) {
                System.out.println("You win!");
                playerWins++;
            } else {
                System.out.println("Computer wins!");
                compWins++;
            }
            System.out.println();
        }
        
        double playerPct = (playerWins * 100.0) / games;
        double compPct = (compWins * 100.0) / games;
        
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Player Win %: " + Math.round(playerPct*100)/100.0);
        System.out.println("Computer Win %: " + Math.round(compPct*100)/100.0);
        
        sc.close();
    }
}
