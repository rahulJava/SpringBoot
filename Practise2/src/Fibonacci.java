
public class Fibonacci {
	public static void main(String[] args) {
		int x =9;
		System.out.println(fib(x));
		
		
		
	}
	public static int fib(int x)
	{
		if(x<=1)
			return x;
		return fib(x-1)+fib(x-2);
	}
	public static int fibd(int n)
	{
		int[] f = new int[n+2];
		f[0]=0;
		f[1]=1;
		for(int i=2;i<=n;i++)
		{
			f[i]=f[i-1]+f[i-2];
		}
		return f[n];
	}
	

}
