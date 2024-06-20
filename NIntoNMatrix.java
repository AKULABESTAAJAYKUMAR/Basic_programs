package Practice01patterns;
import java.util.Scanner;
public class NIntoNMatrix {
	public static void main(String[] args) {
		System.out.println("user please enter the size ");
		int n=new Scanner(System.in).nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
