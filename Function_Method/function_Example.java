
package Function_Method;

import java.util.Scanner;


public class function_Example{

    public static int  calculatesum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first num");
        int a =sc.nextInt();
        System.out.println("enter the second num");
        int b =sc.nextInt();
        int result = calculatesum(a,b);
        System.out.println("sum is:"+ result);

    }

}

// FUNCTION WITH PARAMETER  and RETURNTYPE VOID
// package Function_Method;

// import java.util.Scanner;


// public class function_Example{

//     public static void calculatesum(int num1, int num2){
//         int sum = num1 + num2;
//         System.out.println("sum is:"+ sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the first num");
//         int a =sc.nextInt();
//         System.out.println("enter the second num");
//         int b =sc.nextInt();
//         calculatesum(a,b);
//     }

// }



// FUNCTION WITHOUT PARAMETERS
// package Function_Method;

// public class function_Example{

//     public static void printHelloWorld(){
//         System.out.println("Helloworld");
//     }
//     public static void main(String[] args) {
//         printHelloWorld();


//     }
// }