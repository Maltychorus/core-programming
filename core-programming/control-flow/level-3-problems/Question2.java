import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Grades");
        
        System.out.print("Enter mark in physics : ");
        double marks1 = sc.nextDouble();
        
        System.out.print("Enter mark in chemistry : ");
        double marks2 = sc.nextDouble();
        
        System.out.print("Enter mark in maths : ");
        double marks3 = sc.nextDouble();
        
        double average = (marks1 + marks2 + marks3)/3;
        
        System.out.print("Average marks : "+ average + "%");
        
        if(average >= 80){
            System.out.println("Grade : A");
            System.out.print("Remarks : Level 4, above agency-normalized standards");
        }else if(average >= 70){
            System.out.println("Grade : B");
            System.out.print("Remarks : Level 3, at agency-normalized standards");
        }else if(average >= 60){
            System.out.println("Grade : C");
            System.out.print("Remarks : Level 2, below, but approaching agency-normalized standards");
        }else if(average >= 50){
            System.out.println("Grade : D");
            System.out.print("Remarks : Level 1, well below agency-normalized standards");
        }else if(average >= 40){
            System.out.println("Grade : E");
            System.out.print("Remarks : Level 1-, too below agency-normalized standards");
        }else{
            System.out.println("Grade : R");
            System.out.print("Remarks : Remedial standards");
        }
        sc.close();
    }
}