import java.util.*;
public class ternary1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        ternary1 minTernary=new ternary1();
        int minimum= minTernary.min(num1,num2);
        System.out.println("Minimun no. is:"+ minimum);
    }
    public int min(int num1,int num2){
        return num1<num2?num1:num2 ;
    }
}
