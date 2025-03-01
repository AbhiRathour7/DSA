package patterns;

import java.util.Scanner;

public class inverted_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

// METHOD 1
// package patterns;

// import java.util.Scanner;

// public class inverted_star {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=n;j>=i;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
// }
