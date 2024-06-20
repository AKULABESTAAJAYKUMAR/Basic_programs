package Practice01;
import java.util.Scanner;
public class HcfOfTwoNUmbers {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("user please enter number1");
		int a=s.nextInt();
		System.out.println("user please enter number 2");
		int b=s.nextInt();
		int res=0;
      for(int i=1;i<=b;i++)
      {
    	  if(a%i==0 && b%i==0)
    	  {
    		  res=i;
    	  }
      }
      System.out.println(res+" is the hcf number");
	}
	}
