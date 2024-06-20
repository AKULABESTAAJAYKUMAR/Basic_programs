package Practice01;
import java.util.Scanner;
public class AutomorphicNumber {
	public static void main(String[] args) {
		System.out.println("user please enter a number");
		int n=new Scanner(System.in).nextInt();
		int sq=n*n;int count=0;int res=0;
		int org=n;
		while(n>0)
		{
			int r=n%10;
			count++;
			n=n/10;
		}
		int k=(int)Math.pow(10, count);
		n=org;
		while(sq>0)
		{
			int r=sq%k;
			res=r;
			break;
		}
		if (org==res)
			System.out.println(org+" automorphic number");
		else
			System.out.println(org+" not automorphic number");
	}
}
