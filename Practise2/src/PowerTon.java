
public class PowerTon {
	public static void main(String[] args) {
		System.out.println(pow(2,10));
	}
	public static int pow(int x, int n)
	
	{
		if(n==0)
		{
			return 1;
		}
		int half= pow(x,n/2);
		if(n%2==0)
		{
			return half* half;
		}
		else
		{
			return half* half * x;
		}
	}

}
