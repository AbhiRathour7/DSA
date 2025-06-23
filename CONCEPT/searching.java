
// SEARCHING WITH RANDOM VARIABLES

import java.util.Random;

public class searching {
    public static void main(String[] args) {
    
    int num[]=new int [32];
    int target=102;

     Random rand = new Random();

        //  Fill the array with random values (e.g., between 1 and 1000)
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(1000) + 1; // Generates random numbers from 1 to 1000
        }

        //  Sorting the array for binary search to work correctly
        java.util.Arrays.sort(num);

    int result1 = linearSearch(num, target);
    int result2 = binarySearch(num, target,0, num.length-1);
    if(result2 !=-1){
        System.out.println("element found at index : "+result2);
    }
    else{
        System.out.println("element not found");
    }
}

public static int  linearSearch(int num[], int target){
   int steps =0;
    for(int i=0;i<num.length;i++){
        steps++;
        if(num[i]==target){
            System.out.println("steps take by linear: "+ steps);
        return i;
        }
    }
    System.out.println("steps take by linear: "+ steps);
    return -1;
}

public static int  binarySearch(int num[], int target,int l,int r){
    int steps=0;
    // int l=0,r=num.length-1;
    if(l<=r){
        steps++;
        int m =(l+r)/2;

    if(num[m]==target){
        System.out.println("steps take by binary: "+ steps);
        return m;
    } 
    else if(num[m]<target){
        return binarySearch(num, target, m+1,r);
    }
    else {
       return binarySearch(num, target,l,m-1);
    }
}
System.out.println("steps take by binary: "+ steps);
    return -1;
}
}




// LINEAR AND BINARY SEARCH WITH RECURSIVE METHOD.
// package CONCEPT;

// public class search {
//     public static void main(String[] args) {
    
//     int num[]=new int [32];
//     int target=900;

//     int result1 = linearSearch(num, target);
//     int result2 = binarySearch(num, target,0, num.length-1);
//     if(result1 !=-1){
//         System.out.println("element found at index : "+result1);
//     }
//     else{
//         System.out.println("element not found");
//     }
// }

// public static int  linearSearch(int num[], int target){
//    int steps =0;
//     for(int i=0;i<num.length;i++){
//         steps++;
//         if(num[i]==target){
//             System.out.println("steps take by linear: "+ steps);
//         return i;
//         }
//     }
//     System.out.println("steps take by linear: "+ steps);
//     return -1;
// }

// public static int  binarySearch(int num[], int target,int l,int r){
//     int steps=0;
//     // int l=0,r=num.length-1;
//     if(l<=r){
//         steps++;
//         int m =(l+r)/2;

//     if(num[m]==target){
//         System.out.println("steps take by binary: "+ steps);
//         return m;
//     } 
//     else if(num[m]<target){
//         return binarySearch(num, target, m+1,r);
//     }
//     else {
//        return binarySearch(num, target,l,m-1);
//     }
// }
// System.out.println("steps take by binary: "+ steps);
//     return -1;
// }
// }


//BINARY SEAECH WITH [O(log n) time complexity ]

// package CONCEPT;

// public class search {
//     public static void main(String[] args) {
    
//     int num[]={5,7,9,11,13};
//     int target=13;

//     int result1 = linearSearch(num, target);
//     int result2 = binarySearch(num, target);
//     if(result1 !=-1){
//         System.out.println("element found at index : "+result1);
//     }
//     else{
//         System.out.println("element not found");
//     }
// }

// public static int  linearSearch(int num[], int target){
//    int steps =0;
//     for(int i=0;i<num.length;i++){
//         steps++;
//         if(num[i]==target){
//             System.out.println("steps take by linear: "+ steps);
//         return i;
//         }
//     }
//     System.out.println("steps take by linear: "+ steps);
//     return -1;
// }

// public static int  binarySearch(int num[], int target){
//     int steps=0;
//     int l=0,r=num.length-1;
//     while(l<=r){
//         steps++;
//         int m =(l+r)/2;

//     if(num[m]==target){
//         System.out.println("steps take by binary: "+ steps);
//         return m;
//     } 
//     else if(num[m]<target){
//         l=m+1;
//     }
//     else {
//         r=m-1;
//     }
// }
// System.out.println("steps take by binary: "+ steps);
//     return -1;
// }
// }




// LINEAR SEARCH with [ O(n) time complexity ]

// package CONCEPT;

// public class search {
//     public static void main(String[] args) {
    
//     int num[]={5,7,9,11,13};
//     int target=11;

//     int result = linearSearch(num, target);
//     if(result !=-1){
//         System.out.println("element found at index : "+result);
//     }
//     else{
//         System.out.println("element not found");
//     }
// }

// public static int  linearSearch(int num[], int target){
//     for(int i=0;i<num.length;i++){
//         if(num[i]==target){
//         return i;
//         }
//     }
//     return -1;
// }
// }


