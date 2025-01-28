import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("entre the number");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println("the number is:" +n);
        }while (true)  ;
    }
    
}



//EXAMPLE 1.
// public class BreakExample {
//     public static void main(String[] args) {
//         for(int i=1; i<=5; i++){
//             if(i==4){
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("i'm out of the loop");
//     }
    
// }
