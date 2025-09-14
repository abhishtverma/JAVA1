import java.util.*;
public class score3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        int num1=sc.nextInt();
        score3 abs=new score3();
        String grade= abs.marks(num1);
        System.out.println("Grade is: "+ grade);
    }
    public String marks(int num1){
        return (num1>80?"High":((num1>=50)?"Moderate":((num1<50)?"Low":"Invalid"))) ;
    }
}