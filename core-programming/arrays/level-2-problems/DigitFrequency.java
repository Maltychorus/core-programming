import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] freq = new int[10];
        int temp = num;
        while(temp != 0) {
            freq[temp % 10]++;
            temp /= 10;
        }

        System.out.println("Digit Frequency in " + num + ":");
        for(int i = 0; i < 10; i++) {
            if(freq[i] > 0)
                System.out.println("Digit " + i + ": " + freq[i]);
        }

        sc.close();
    }
}
