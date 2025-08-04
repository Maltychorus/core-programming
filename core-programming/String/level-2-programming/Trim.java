import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int start = 0, end = text.length() - 1;
        while (start < text.length() && text.charAt(start) == ' ') start++;
        while (end >= 0 && text.charAt(end) == ' ') end--;
        String manual = "";
        for (int i = start; i <= end; i++) manual += text.charAt(i);
        System.out.println("Manual trim: [" + manual + "]");
        System.out.println("Built-in trim: [" + text.trim() + "]");
        System.out.println("Equal: " + manual.equals(text.trim()));
        sc.close();
    }
}
