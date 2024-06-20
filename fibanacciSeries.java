package Practice01;
import java.util.Scanner;
public class fibanacciSeries {
public static void main(String[] args) {
	System.out.println("user please enter the numer of count");
	int range=new Scanner(System.in).nextInt();
	int a=0;int b=1;
	System.out.print(a+" "+b+" ");
	for(int i=3;i<=range;i++)
	{
		int c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
	}
}
}
