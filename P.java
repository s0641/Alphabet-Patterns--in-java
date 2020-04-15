import java.util.*;
class P
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n=sc.nextInt();
		
		for(int i=0 ;i<n; i++)
		{
			for(int j=0;j<n; j++)
			{
				if(j==0||j==n-1 && i<n/2||i==n/2||i ==0)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
