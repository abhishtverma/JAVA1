import java.util.*;
public class absolute2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        int num1=sc.nextInt();
        absolute2 abs=new absolute2();
        int absol= abs.absolutenum(num1);
        System.out.println("Absolute no. is:"+ absol);
    }
    public int absolutenum(int num1){
        return num1>0?num1:num1*-1 ; // return num1>0?num1:num1-num1-num1 ;
    }
}
    

