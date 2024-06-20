package Practice01;
import java.util.Scanner;
public class ReverseANumber {
public static void main(String[] args) {
	System.out.println("user! please enter a number");
	int i=new Scanner(System.in).nextInt();int res=0;
	while(i>0)
	{
		int r=i%10;
		res=res*10+r;
		i=i/10;
	}
	System.out.println(res);
}
}
