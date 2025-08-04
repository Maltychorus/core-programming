import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int length = 0;
        try {
            for (;; length++) text.charAt(length);
        } catch (Exception e) {
            System.out.println("Manual length: " + length);
        }
        System.out.println("Built-in length: " + text.length());
        sc.close();
    }
}
