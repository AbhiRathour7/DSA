
import java.util.Scanner;

public class Ternary_operator {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the number :");
        int a = sc.nextInt();
        String type = ((a % 2) == 0)? "even" : "odd";
        System.out.println("the number is:" + type);
    }
}
