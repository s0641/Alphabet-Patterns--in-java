import java.util.*;
class V
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		for(int i= 0; i<=n/2;i++ )
		{
			for(int j=0 ; j<n; j++)
			{
				if(j==i|| j+i==n-1)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
}