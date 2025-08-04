import java.util.Scanner;

class main {
    static boolean isLeap(int year) {
        return (year%4==0 && year%100!=0) || (year%400==0);
    }
    static int getDays(int month, int year) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month==2 && isLeap(year)) return 29;
        return days[month-1];
    }
    static int firstDay(int d,int m,int y) {
        int y0 = y - (14 - m)/12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12*((14-m)/12)-2;
        return (d + x + (31*m0)/12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();

        int first = firstDay(1,month,year);
        int days = getDays(month,year);

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i=0;i<first;i++) System.out.print("    ");
        for (int day=1; day<=days; day++) {
            System.out.printf("%3d ",day);
            if ((day+first)%7==0) System.out.println();
        }
        sc.close();
    }
}
