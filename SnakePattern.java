package Practice01patterns;

public class SnakePattern {
	public static void main(String[] args) {
		int n=5;
		//		1   2  3  4  5
		//		10  9  8  7  6
		//		11 12 13 14 15
		//		20 19 18 17 16
		//		21 22 23 24 25
		for(int i=1;i<=n;i++)
		{
			if(i%2 !=0)
			{
				int k=(n*i)-(n-1);
				for(int j=1;j<=n;j++)
				{
					System.out.print(k+"\t");
					k++;
				}
			}
			else
			{
				if(i%2==0)
				{
					int k=(n*i);
					for(int j=1;j<=n;j++)
					{
						System.out.print(k+"\t");
						k--;
					}
				}

			}
			System.out.println();
		}
	}
}
