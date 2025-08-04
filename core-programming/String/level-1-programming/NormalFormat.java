import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numStr = sc.next();
        try {
            int number = Integer.parseInt(numStr);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException");
        }
        sc.close();
    }
}
