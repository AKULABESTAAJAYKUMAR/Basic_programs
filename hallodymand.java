package day1106;

public class hallodymand {
	public static void main(String[] args) {
		int n=5;
		int sp=n-1;int sp2=0;
		int st=1;int st2=2*n-1;
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*");
            }
            sp--;
            st += 2;
            System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
	for(int k=1;k<=sp2;k++)
	{
		System.out.print(" ");
	}
	for(int l=1;l<=st2;l++)
	{
		System.out.print("*");
	}
	
	sp2++;
	st2-=2;
	System.out.println();
}
}
}
