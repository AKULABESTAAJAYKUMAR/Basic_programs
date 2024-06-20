package Practice01;
import java.util.Scanner;
public class palindromeOrNot {
	public static void main(String[] args) {
		System.out.println("user please enter a number");
		int n=new Scanner(System.in).nextInt();
		int orginal=n;int res=0;
		while(n>0)
		{
			int r=n%10;
			res=res*10+r;
			n=n/10;
		}
		if(orginal ==res)
			System.out.println(orginal+" it is a palindrome number");
		else System.out.println(orginal+" it is not palindrome");
	}

}
