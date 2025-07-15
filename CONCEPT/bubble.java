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



// if array is already sorted


// public class bubble {
//         public static void main(String[] args) {
//         int num[] = {1,2,3,4,5};
//         int size= num.length;
//         int temp=0;
//         System.out.println("before sorting : ");
//         for(int n:num){
//             System.out.print(n+ " ");
//         }

//             for(int i=0;i<size;i++){
//                 int swap =0;
//                 for(int j=0; j<size-i-1;j++){
//                     if(num[j]>num[j+1]){
//                         temp=num[j];
//                         num[j]=num[j+1];
//                         num[j+1]=temp;
//                         swap++;
//                     }
//                 }
//                 System.out.println();
//                 if(swap==0){
//                     System.out.println("already sorted array ");
//                     break;
//                 }

//                 System.out.println();
//                 for(int n:num){
                    
//                     System.out.print(n+ " ");
//                 }
//             }

//             System.out.println();
//             System.out.println("after sorting : ");
//             for(int n:num){
//             System.out.print(n+ " ");
//         }
        

//     }
// }

