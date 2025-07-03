package Arrays;

public class linear_search {
    public static int  linear(int num[], int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6};
        int key =4;
        System.out.println("at index: "+linear(num, key));
    }
}
