package Practice01;
import java.util.Scanner;
public class ArmStrongNumber {
	public static void main(String[] args) {
		System.out.println("user please enter the number");
		int n=new Scanner(System.in).nextInt();
		int count=0;int org=n;int res=0;
		//3 cube and sum
		while(n>0)
		{
			int r=n%10;
			count++;
			n=n/10;
		}
		n=org;
		while(n>0)
		{
			int r=n%10;
			int sum=(int)Math.pow(r, count);
			res=res+sum;
			n=n/10;
		}
		if(org==res)
			System.out.println(org+" armstrongNUmber");
		else
			System.out.println(org+ " not armstrong number");
	}
}
