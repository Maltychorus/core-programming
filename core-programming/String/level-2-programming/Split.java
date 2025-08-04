import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine() + " ";
        int count = 0;
        for (int i = 0; i < text.length(); i++) if (text.charAt(i) == ' ') count++;

        String[] manual = new String[count];
        int idx = 0, start = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                manual[idx++] = text.substring(start, i);
                start = i + 1;
            }
        }

        String[] builtin = text.trim().split(" ");
        boolean equal = manual.length == builtin.length;
        for (int i = 0; i < manual.length && equal; i++) {
            if (!manual[i].equals(builtin[i])) equal = false;
        }

        System.out.println("Manual words:");
        for (String w : manual) System.out.print(w + " ");
        System.out.println("\nArrays equal: " + equal);
        sc.close();
    }
}
