package Practice01;
import java.util.Scanner;
public class spyNumberOrNOt {
	public static void main(String[] args) {
		System.out.println("user please enter a number");
		int n=new Scanner(System.in).nextInt();
		int orginal=n;int res1=0;int res2=1;
		while(n>0)
		{
			int r=n%10;
			res1=res1+r;
			res2=res2*r;
			n=n/10;
		}
		if(res1==res2)
		System.out.println(orginal+" it is a spy number");
		else
		System.out.println(orginal+" it is not a spy number");
	}
}
