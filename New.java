import java.util.Scanner;
public class New {
	public static void isPrime(int m,int n)
	{
		boolean isPrime =true;
		int cnt=0;
		int sum=0;
		OUT:
		for(int j=m+1;j<n;j++)
		{
			isPrime=true;
		for(int k=2;k<j;k++)
		{
			if(j%k==0)
			{
				isPrime=false;
				continue OUT;
			}
		}
		if(isPrime)
		{
			cnt++;
			sum+=j;
		}
		}
		System.out.println("在"+m+"和"+n+"之间有"+cnt+"个素数，总和为"+sum);
		
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		if(m==1) m=2;
		isPrime(m, n);
		
		}
}
