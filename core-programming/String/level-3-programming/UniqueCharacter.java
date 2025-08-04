import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] unique = new char[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) { found = true; break; }
            }
            if (!found) unique[count++] = c;
        }

        System.out.print("Unique characters: ");
        for (int i = 0; i < count; i++) System.out.print(unique[i] + " ");
        sc.close();
    }
}
