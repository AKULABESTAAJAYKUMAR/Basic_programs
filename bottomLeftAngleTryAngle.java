package Practice01patterns;
import java.util.Scanner;
public class bottomLeftAngleTryAngle {
public static void main(String[] args) {
	System.out.println("user please enter the size of tryangle");
	int n=new Scanner(System.in).nextInt();
	int st=1;
	int sp=n-1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=sp;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=st;j++)
		{
			System.out.print("*");
		}
		st++;
		sp--;
		System.out.println();
	}
}
}
