import java.util.Scanner;
public class pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i,j,k;

        for(i =1; i <= n; i++)
        {

            for(j =1; j <= n; j++)
            {
                if(j <= i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(j = n-1; j >= 1; j--)
            {
                if(j <= i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
        for(i =1; i <= n; i++)
        {

            for (j = n; j > i; j--)
                System.out.print("  ");

            for (k = 1; k < 2*i; k++)
                System.out.print("* ");

            System.out.println();
        }


    }
}