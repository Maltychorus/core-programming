import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String manual = "";
        for (int i = start; i < end; i++) manual += text.charAt(i);
        System.out.println(manual);
        System.out.println(text.substring(start, end));
        System.out.println(manual.equals(text.substring(start, end)));
        sc.close();
    }
}
