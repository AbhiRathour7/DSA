
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the second number: ");
        float num2 = sc.nextFloat();
        System.out.println("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+': System.out.println(num1+num2);
                
                break;
            case '-': System.out.println(num1 - num2);
                break;
            case '*': System.out.println(num1 * num2);
                break;
            case '/': System.out.println(num1 / num2);
                break;
            case '%' : System.out.println(num1 % num2);
            break;    
            default:
                System.out.println("Invalid operator");
        }
    }
}
