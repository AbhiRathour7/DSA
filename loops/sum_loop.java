import java.util.Scanner;

public class sum_loop {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int i=1;
        int sum = 0;
        while(i<=n){
            sum = sum + i;
            i++;
        }
            System.out.println("sum is :" +sum);
    
}
}