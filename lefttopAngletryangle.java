package Practice01patterns;
import java.util.Scanner;
public class lefttopAngletryangle {
	public static void main(String[] args) {
		System.out.println("user please enter size");
		int n=new Scanner(System.in).nextInt();
		int sp=0;int st=n;
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
			sp++;
			st--;
			System.out.println();
		}
	}
}
