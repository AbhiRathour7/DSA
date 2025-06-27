public class insertion {
    public static void main(String[] args) {
        int num[] = {6,5,2,8,9,4};
        int size= num.length;

        System.out.println("before sorting : ");
        for(int n : num){
            System.out.print(n + " ");
        }
                for(int i=1;i<size;i++){
                    
                    int key = num[i];
                    int j = i-1;

                    while(j>=0 && num[j]>key){
                        num[j+1] = num[j];
                        j--;
                    }
                    num[j+1]=key;
                    }


            System.out.println();
            
            System.out.println("after sorting : ");
            for(int n : num){
                System.out.print(n + " ");
        }
        

    } 
}



//WITHOUT FOR EACH LOOP 
// public class insertion {
//     public static void main(String[] args) {
//         int num[] = {6,5,2,8,9,4};
//         int size= num.length;

//         System.out.println("before sorting : ");
//         for(int n=0;n<size;n++){
//             System.out.print(num[n]+ " ");
//         }
//                 for(int i=1;i<size;i++){
                    
//                     int key = num[i];
//                     int j = i-1;

//                     while(j>=0 && num[j]>key){
//                         num[j+1] = num[j];
//                         j--;
//                     }
//                     num[j+1]=key;
//                     }


//             System.out.println();
            
//             System.out.println("after sorting : ");
//             for(int n=0;n<size;n++){
//                 System.out.print(num[n]+ " ");
//         }
        

//     } 
// }
