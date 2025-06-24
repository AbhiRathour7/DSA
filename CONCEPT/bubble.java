public class bubble {
        public static void main(String[] args) {
        int num[] = {6,5,2,8,9,4};
        int size= num.length;
        int temp=0;
        System.out.println("before sorting : ");
        for(int n:num){
            System.out.print(n+ " ");
        }

            for(int i=0;i<size;i++){
                for(int j=0; j<size-i-1;j++){
                    if(num[j]>num[j+1]){
                        temp=num[j];
                        num[j]=num[j+1];
                        num[j+1]=temp;
                    }
                }
                System.out.println();
                for(int n:num){
                    
                    System.out.print(n+ " ");
                }
            }

            System.out.println();
            System.out.println("after sorting : ");
            for(int n:num){
            System.out.print(n+ " ");
        }
        

    }
}

// public class bubble {
//         public static void main(String[] args) {
//         int  a[] ={6,5,2,8,3,7};
//         int size=a.length;
//         int mxi=-1;
//         int temp=0;
//         System.out.println("before sorting");
//         for(int n:a){
//             System.out.print(n+" ");
//         }
//         for(int i=0;i<size;i++){
//             mxi=i;
//             for(int j=mxi+1;j<size;j++){
               
//                 if(a[mxi]>a[j]){
//                     temp=a[j];
//                     a[j]= a[mxi];
//                     a[mxi]=temp;
//                      mxi =j;
//                 }
//                 else{
//                     mxi =j;
//                 }
                

//                 System.out.println();
//                 for(int n:a){
//                     System.out.print(n+" ");
//             }
//             }
//         }
    

        

//         System.out.println("after sorting");
//         for(int n:a){
//             System.out.print(n+" ");
//     }
// }
// }
        