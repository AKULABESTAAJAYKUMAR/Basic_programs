package Practice01;
import java.util.Scanner;
public class NeonNumberOrNot {
	public static void main(String[] args) {
		//9 81=8+1 =9
		System.out.println("user please enter the number");
		int n=new Scanner(System.in).nextInt();
		int sq=n*n;int sum=0;
		while(sq>0)
		{
			int r=sq%10;
			sum=sum+r;
			sq=sq/10;
		}
		if(n==sum)System.out.println(n+" neon number");
		else System.out.println(n+" non neon number");
	}

}
