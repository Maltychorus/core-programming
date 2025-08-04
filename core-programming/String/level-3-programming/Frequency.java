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

        System.out.println("Char\tFrequency");
        for (int i = 0; i < count; i++) {
            char c = unique[i];
            int f = 0;
            for (int j = 0; j < text.length(); j++) if (text.charAt(j) == c) f++;
            System.out.println(c + "\t" + f);
        }
        sc.close();
    }
}
