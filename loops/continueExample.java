
import java.util.Scanner;

public class continueExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
            continue;
        } 
        System.out.println("the num is :" +num);
    }while (true);
    }
}
