import java.util.*;
public class Tax_calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income: ");
        float income = sc.nextFloat();
        if(income < 500000){
            System.out.println("Your tax is: "+(income*0));
        }
        else if(income>500000 && income<1000000){
            System.out.println("Your tax is: "+(income*0.2));
        }
        else{
            System.out.println("Your tax is: "+(income*0.3));
        }
    }
}