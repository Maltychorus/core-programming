import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] arr = text.toCharArray();
        int[] freq = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') continue;
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) { count++; arr[j] = '0'; }
            }
            freq[i] = count;
        }

        System.out.println("Char\tFrequency");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '0') System.out.println(arr[i] + "\t" + freq[i]);
        }
        sc.close();
    }
}
