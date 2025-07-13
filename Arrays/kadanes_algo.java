package Arrays;

public class kadanes_algo {

// if all elements in array are not negative.
    public static void kadanes(int num[]){
        int ms= Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<num.length;i++){
            cs += num[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("maximun subarray : "+ms);
    }

    

// if all elements in array are  negative.

    // public static void kadanes(int num[]){
    //     int ms=Integer.MIN_VALUE;
    //     int cs=num[0];
    //     for(int i=1;i<num.length;i++){
    //     cs= Math.max(num[i], cs+num[i]);
    //     ms=Math.max(cs, ms);
    //         }
    //      System.out.println("maximun subarray : "+ms);
    // }


    public static void main(String[] args) {
        int num [] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);
    }

}
