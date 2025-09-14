
import java.util.Scanner;
import java.lang.Math;
public class LeapYear
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to check leap year :");
		int i=sc.nextInt();
// 		System.out.println("Enter the year to check leap year :");
// 		int j=sc.nextInt();
		fact(i);

	}
	public static void fact(int m)
	{
		int k;
		int a;
		int b;
		for (a=1; a<=m; a++)
		{
			for (b=m; b>a; b--)
			{
				System.out.print(" ");
			}
			for (k=1; k<=a; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
}