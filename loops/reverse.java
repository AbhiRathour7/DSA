public class reverse {
    public static void main(String[] args) {
        int n=10899;
        while(n > 0){
        int a = n%10;
         n = n/10;
        System.out.print(a +" ");
        }
        System.out.println();
    }
}



//FLIPPING THE NUMBER.
// public class reverse {
//     public static void main(String[] args) {
//         int n=10899;
//         int rev = 0;
//         while(n > 0){
//         int a = n%10;
//         rev = rev*10 +a;
//         n = n/10;
//         }
//         System.out.println(rev);
//     }
// }



//REVERSE THE NUMBER.
// public class reverse {
//     public static void main(String[] args) {
//         int n=10;
//         for(int i=n; i>=1; i--){
//             System.out.print(i+" ");
//         }
//     }
// }
