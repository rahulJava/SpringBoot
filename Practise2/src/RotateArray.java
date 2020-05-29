

public class RotateArray 
{
	public static void main(String[] args) {
		
		int x[][]= {{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		printArray(x);
		System.out.println("---------------");
		rotatematrix(x);
		printArray(x);
		
	}

	public static void rotatematrix(int x[] [])
	{
		int n = x.length;
		for(int i =0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int temp=x[j][i];
					x[j][i]=x[i][j];
					x[i][j]=temp;
			}
		}
		printArray(x);
		System.out.println("---------------");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<n/2;j++)
			{
				int temp=x[i][j];
				x[i][j]=x[i][n-j-1];
				x[i][n-j-1 ]=temp;
			}
		}
	}
	public static void printArray(int [][]x)
	{for(int i=0;i<x.length;i++)
	{
		for(int j=0;j<x.length;j++)
		{
			System.out.print(x[i][j]);
		}
		System.out.println();
	}
		
	}
}
