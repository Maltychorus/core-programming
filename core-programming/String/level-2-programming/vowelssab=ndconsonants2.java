import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("Char\tType");
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char low = c;
            if (low >= 'A' && low <= 'Z') low += 32;
            if (low >= 'a' && low <= 'z') {
                if ("aeiou".indexOf(low) >= 0) System.out.println(c + "\tVowel");
                else System.out.println(c + "\tConsonant");
            } else {
                System.out.println(c + "\tNot a Letter");
            }
        }
        sc.close();
    }
}
