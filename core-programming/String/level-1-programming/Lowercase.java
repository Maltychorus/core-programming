import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String manual = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') manual += (char)(c + 32);
            else manual += c;
        }
        System.out.println(manual);
        System.out.println(text.toLowerCase());
        System.out.println(manual.equals(text.toLowerCase()));
        sc.close();
    }
}
