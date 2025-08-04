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

        String[][] wordLen = new String[count][2];
        for (int i = 0; i < count; i++) {
            int len = 0;
            try {
                for (;; len++) words[i].charAt(len);
            } catch (Exception e) {}
            wordLen[i][0] = words[i];
            wordLen[i][1] = String.valueOf(len);
        }

        System.out.println("Word\tLength");
        for (int i = 0; i < count; i++) {
            System.out.println(wordLen[i][0] + "\t" + Integer.parseInt(wordLen[i][1]));
        }
        sc.close();
    }
}
