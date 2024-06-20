package Practice01;
import java.util.Scanner;
public class SumOfNumbersUpToSingleDigit {
public static void main(String[] args) {
	//2999 29  11 1 
	System.out.println("user please enter the number");
	int n=new Scanner(System.in).nextInt();
	int sum=0;
	while(n>0)
	{
		int r=n%10;
		sum=sum+r;
		n=n/10;
		if(sum>9 && n==0)
		{
			n=sum;
			sum=0;
			int l=n%10;
			sum=sum+r;
			n=n/10;
		}
	}
	System.out.println(sum);
}
}
