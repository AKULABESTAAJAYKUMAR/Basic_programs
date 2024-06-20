package Practice01;

public class abudhanNumberInJava {
public static void main(String[] args) {
	int a=49;
	int n=50;int sum=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0){
			sum=sum+i;
		}
	}
	if (sum>a)
	{
		System.out.println("abudhan number");
	}
	else
	{
		System.out.println("not abudhan number");
	}
}
}
