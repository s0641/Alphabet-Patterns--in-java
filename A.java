import java.util.*;
class A
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n ;i++ )
        {
            for (int j=0;j<=n ;j++ )
            {
                if (i<n && i==n/2||j==0||j==n||i==0)
                {
					if(i==0 && (j==0||j==n))
					{
						System.out.print("  ");
					}
					else
					{
						System.out.print("* ");
					}
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