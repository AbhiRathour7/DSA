package Arrays;

// brute force
public class max_subarray_sum {
    

    public static void max_subarray(int num[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(num[k]+" ");
                    currsum+=num[k];
                }
                System.out.println("current sum :"+currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("max sum: "+maxsum);
    }

    public static void main(String[] args) {
        int num[]= {1,-2,6,-1,3};
        max_subarray(num);
    }
}


  