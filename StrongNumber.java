package Practice01;
import java.util.Scanner;
public class StrongNumber {
	public static void main(String[] args) {
		System.out.println("user please enter a number");
		int n=new Scanner(System.in).nextInt();
		int sum=0;int res=1;int org=0;
		int dup=n;
		while(n>0)
		{
			int r=n%10;
			sum=0;res=1;
			for(int i=1;i<=r;i++)
			{
				res=res*i;
				sum=res;
			}
			org=org+sum; n=n/10;
		}
		if(dup==org)
			System.out.println(dup+" strong number");
		else
			System.out.println(dup+" not a strong number");
	}
}
