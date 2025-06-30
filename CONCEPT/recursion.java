public class recursion {
    public static void main(String [] args){

        int result=fact(5);
        System.out.println(result);
        
    }

    public static int fact(int i){

        if(i!=0){
            return i*fact(i-1);
        }
        return 1;

    }

}


// without recursion

// import java.util.*;
// public class recursion {
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int  num = sc.nextInt();

//         int fact=1;
//         for(int i=1; i<=num;i++){
//             fact= fact*i;
//         }
//         System.out.println("num:"+ fact);
   
//     }
// }




// public class recursion {
//     public static void main(String [] args){

//         f1(10);
        
//     }

//     public static void f1(int i){
//         System.out.println(i);
//         if(i>1){
//             f1(i-1);
//         }
        
//     }
// }
