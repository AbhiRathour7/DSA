package Function_Method;

import java.util.*;

public class questions {
    

    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first number:");
        int a=sc.nextInt();
    
       
        System.out.println("factorial:"+factorial(a));

    }
}

// product of two numbers

// package Function_Method;

// import java.util.*;

// public class questions {
    

//     public static int productOfTwo(int a,int b){
//         int prod=a*b;
//         return prod;
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("enter first number:");
//         int n=sc.nextInt();
//         System.out.println("enter second number:");
//         int m=sc.nextInt();
//         int result =productOfTwo(n,m);
//         System.out.println("product is ="+ result);

//     }
// }
