package Arrays;

public class sub_array {

    public static void printsubarray(int num[]){
       int total_size=0;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(num[k]+" ");
                    sum+=num[k];
                }
                System.out.println();
                 System.out.print("total sum: "+sum);
                total_size++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub array: "+total_size);
    }

    public static void main(String[] args) {
        int num[]= {2,4,6,8,10};
        printsubarray(num);
    }
}
