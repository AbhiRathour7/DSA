package Arrays;

public class kadanes_algo {

        public static void max_subarray(int num[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];

        //calaulate prefix array
        prefix[0]=num[0];
        for(int i=1;i<num.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
//sub array 

        for(int i=0;i<num.length;i++){
            
            for(int j=i;j<num.length;j++){
               
    
                currsum= i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("max sum: "+maxsum);
    }

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
    public static void main(String[] args) {
        int num [] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);
    }
    
}
