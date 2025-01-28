
import java.util.Scanner;
public class question {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int n = sc.nextInt();
for(int i=1; i<=10; i++){
    System.out.println(n+"*"+i+"="+n*i);
}
}
}



//Q.NO 2.
// import java.util.Scanner;
// public class question {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the number");
// int n = sc.nextInt();
// int fact = 1;
// for(int i = 1; i <= n; i++){
//     fact = fact * i;
// }
// System.out.println("factorial : " + fact );
// }
// }


//Q.NO 1.
// import java.util.Scanner;
// public class question {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int number;
// int choice;
// int evenSum = 0;
// int oddSum = 0;

// do {
// System.out.print("Enter the number ");
// number = sc.nextInt();

// if( number % 2 == 0) {
// evenSum += number;
// } else {
// oddSum += number;
// }
// System.out.print("Do you want to continue? enter 1 for yes or 0 for no");

// choice = sc.nextInt();
// } while(choice==1);

// System.out.println("Sum of even numbers: " + evenSum);
// System.out.println("Sum of odd numbers: " + oddSum);
// }
// }