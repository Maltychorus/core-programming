import java.util.Scanner;
class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator");
        
        System.out.print("Enter the first number : ");
        double n1 = sc.nextDouble();
        
        System.out.print("Enter the second number : ");
        double n2 = sc.nextDouble();
        
        System.out.print("+ , - , * , / : ");
        String op = sc.next();
        
        double result;
        switch (op){
            case "+":
                result = n1 + n2;
                System.out.print("Result : " + result);
            case "-":
                result = n1 - n2;
                System.out.print("Result : " + result);
            case "*":
                result = n1 * n2;
                System.out.print("Result : " + result);
            case "/":
                if(n2 != 0){
                    result = n1 / n2;
                    System.out.print("Result : " + result);
                }else{
                    System.out.print("Cannot divide with zero");
                }
                break;
            default:
                System.out.print("Enter a given operator");
        
        }
        sc.close();
    }
}