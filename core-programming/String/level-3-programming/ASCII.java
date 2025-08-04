import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        System.out.println("Char\tFrequency");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0)
                System.out.println((char)i + "\t" + freq[i]);
        }
        sc.close();
    }
}
