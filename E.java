import java.util.*;
class E
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int n=sc.nextInt();
		for( int i=0; i<n;i++)
		{
			for(int j=0; j<n;j++)
			{
				if(i==0|| i==n/2 && j<=n/2 || i==n-1 ||j==0)
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