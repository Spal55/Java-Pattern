import java.util.*;

public class pattern
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the height of the pattern: ");
        int height=sc.nextInt();
        int h=height-1;
        System.out.println("\nThis the pattern:\n\n");

        for (int i=0;i<=h;i++)
        {
            for (int j=0;j<=i;j++)
                System.out.print("*");
            for (int s=0;s<=2*(h-i);s++)
                System.out.print(" ");
            for (int j=i;j>=0;j--)
                System.out.print("*");
            System.out.println();
        }
        for (int i=h;i>=0;i--)
        {
            for (int j=0;j<=i;j++)
                System.out.print(" ");
            for (int k=i;k<=h;k++)
                System.out.print("*"+" ");
            System.out.println();
        }
    }
}