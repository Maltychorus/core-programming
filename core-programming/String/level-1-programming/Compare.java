import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean equal = s1.length() == s2.length();
        if (equal) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    equal = false;
                    break;
                }
            }
        }
        System.out.println(equal);
        System.out.println(s1.equals(s2));
        sc.close();
    }
}
