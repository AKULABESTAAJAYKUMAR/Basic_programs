package Practice01;
import java.util.Scanner;
public class LcmOfTwoNumbers {
public static void main(String[] args) {
	//2 4 6  8 10
	//3 6 9 12 15 18 21
	Scanner s=new Scanner(System.in);
	System.out.println("user please enter number 1");
	int a=s.nextInt();
	System.out.println("user please enter number 2");
	int b=s.nextInt();
	int n=a<b ? a:b;
	for(int i=n;;i+=n)
	{
		if((i%a==0) && (i%b==0))
		{
			System.out.println("lcm of two numbers are "+i);
			break;
		}
	}
}
}
