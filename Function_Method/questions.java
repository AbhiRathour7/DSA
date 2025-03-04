package Function_Method;

import java.util.*;

public class questions {
    

    public static int productOfTwo(int a,int b){
        int prod=a*b;
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first number:");
        int n=sc.nextInt();
        System.out.println("enter second number:");
        int m=sc.nextInt();
        int result =productOfTwo(n,m);
        System.out.println("product is ="+ result);

    }
}
