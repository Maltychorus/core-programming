import java.util.Scanner;

class main {

    static boolean isPalindromeIterative(String s) {
        int start = 0, end = s.length()-1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }

    static boolean isPalindromeRecursive(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindromeRecursive(s, start+1, end-1);
    }

    static boolean isPalindromeReverse(String s) {
        char[] original = s.toCharArray();
        char[] reverse = new char[s.length()];
        for (int i = 0; i < s.length(); i++) reverse[i] = s.charAt(s.length()-1-i);
        for (int i = 0; i < s.length(); i++) if (original[i] != reverse[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(isPalindromeIterative(text));
        System.out.println(isPalindromeRecursive(text,0,text.length()-1));
        System.out.println(isPalindromeReverse(text));
        sc.close();
    }
}
