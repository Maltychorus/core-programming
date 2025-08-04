import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine() + " ";
        int count = 0;
        for (int i = 0; i < text.length(); i++) if (text.charAt(i) == ' ') count++;

        String[] words = new String[count];
        int idx = 0, start = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[idx++] = text.substring(start, i);
                start = i + 1;
            }
        }

        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (w.length() < shortest.length()) shortest = w;
            if (w.length() > longest.length()) longest = w;
        }

        System.out.println("Shortest: " + shortest);
        System.out.println("Longest: " + longest);
        sc.close();
    }
}
