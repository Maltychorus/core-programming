import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Youngest and tallest");
        
        System.out.print("Amar's age : ");
        int amar_age = sc.nextInt();
        System.out.print("Akbar's age : ");
        int akbar_age = sc.nextInt();
        System.out.print("Anthony's age : ");
        int anthony_age = sc.nextInt();
        
        if((amar_age < akbar_age)&&(amar_age < anthony_age)){
            System.out.println("Youngest : Amar");
        }else if ((akbar_age < amar_age)&&(akbar_age < anthony_age)){
            System.out.println("Youngest : Akbar");
        }else if ((anthony_age < amar_age)&&(anthony_age < akbar_age)){
            System.out.println("Youngest : Anthony");
        }
        
        System.out.print("Amar's height (cm) : ");
        int amar_height = sc.nextInt();
        System.out.print("Akbar's height (cm) : ");
        int akbar_height = sc.nextInt();
        System.out.print("Anthony's height (cm) : ");
        int anthony_height = sc.nextInt();
        
        if((amar_height > akbar_height)&&(amar_height > anthony_height)){
            System.out.print("Tallest : Amar");
        }else if ((akbar_height > amar_height)&&(akbar_height > anthony_height)){
            System.out.print("Tallest : Akbar");
        }else if ((anthony_height > amar_height)&&(anthony_height > akbar_height)){
            System.out.print("Tallest : Anthony");
        }
        sc.close();
    }
}