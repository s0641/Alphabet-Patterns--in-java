import java.util.*;
class J
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=n;i>=0;i-- )
        {
            for (int j=n/2;j>=0 ;j-- )
            {
                if (j==0|| j==1 &&i==n-(n-1)||j==2 && i==n-(n-2)|| j==3 && i==n-(n-3)||j==4 && i==n-(n-4))
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