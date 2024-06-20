package Practice01;
import java.util.Scanner;
public class printEvenDigits {
	public static void main(String[] args) {
		System.out.println("user please enter some digits");
		int n=new Scanner(System.in).nextInt();
		String sc="";String sc2="";
		while(n>0)
		{
			int r=n%10;
			if(r%2==0) { 
				sc=sc+r;
			}
			else
			sc2=sc2+r;	
			n=n/10;
		
		}
		System.out.println("even numbers are: "+sc);
		System.out.println("odd numbers are: "+sc2);
	}
}
