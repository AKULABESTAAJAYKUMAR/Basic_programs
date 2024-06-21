package day1106;

public class hallopyramid {
	public static void main(String[] args) {
		//hallo pyramid
		int n=7;
		int sp=0;
		int st=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++)
			{
				if(j==1||i==1||j==st)
				{
				System.out.print("*");
			}
				else System.out.print(" ");
			}
			st-=2;;
			sp++;;
			System.out.println();
		}
	}
}
