import java.util.Scanner;

class main {
    public static void main(String[] args) {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        int nCards = suits.length*ranks.length;
        String[] deck = new String[nCards];

        int index=0;
        for(String s:suits) for(String r:ranks) deck[index++]=r+" of "+s;

        for (int i=0;i<nCards;i++) {
            int random=i+(int)(Math.random()*(nCards-i));
            String temp=deck[i]; deck[i]=deck[random]; deck[random]=temp;
        }

        Scanner sc=new Scanner(System.in);
        int players=sc.nextInt();
        int cardsEach=sc.nextInt();
        if(players*cardsEach>nCards){System.out.println("Not enough cards");return;}

        String[][] hands=new String[players][cardsEach];
        index=0;
        for(int i=0;i<players;i++)
            for(int j=0;j<cardsEach;j++)
                hands[i][j]=deck[index++];

        for(int i=0;i<players;i++){
            System.out.println("Player "+(i+1)+":");
            for(int j=0;j<cardsEach;j++) System.out.println(hands[i][j]);
            System.out.println();
        }
        sc.close();
    }
}
