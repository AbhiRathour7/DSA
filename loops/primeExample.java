
import java.util.Scanner;

public class primeExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();

        if(n==2){
            System.out.println(n+" is a prime number");
        }
        else{
        boolean Prime = true;
        for(int i=2; i<=Math.sqrt(n); i++){     // optimised loop
            if(n%i==0){
                Prime=false;
            }
        }
        if(Prime==true){
            System.out.println(n+ " is a prime number");
        }
            else{
                System.out.println(n +" : "+ "is not a prime number");
            }
        }
        }
    }



    //NORMAL LOOP.
// import java.util.Scanner;

// public class primeExample {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number:");
//         int n = sc.nextInt();

//         if(n==2){
//             System.out.println(n+" is a prime number");
//         }
//         else{
//         boolean Prime = true;
//         for(int i=2; i<=n-1; i++){
//             if(n%i==0){
//                 Prime=false;
//             }
//         }
//         if(Prime==true){
//             System.out.println(n+ " is a prime number");
//         }
//             else{
//                 System.out.println(n +" : "+ "is not a prime number");
//             }
//         }
//         }
//     }

