
import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the frst number: ");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        if (a>b){
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("b is greater than a");
        }
    }  
}

// NESTED IF-ELSE Condition.
// import java.util.Scanner;

// public class conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the age");
//         int age = sc.nextInt();
//         if (age >=18){
//             System.out.println("you are eligible for voting");
//         }
//         if (age>13 && age<18){
//             System.out.println("you are a teenager");
//         }
//         else{
//             System.out.println("you are not eligible for voting");
//         }
//     }  
// }


// IF-ELSE Condition.
// import java.util.Scanner;

// public class conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the age");
//         int age = sc.nextInt();
//         if (age >=18){
//             System.out.println("you are eligible for voting");
//         }
//         else{
//             System.out.println("you are not eligible for voting");
//         }
//     }  
// }
