import java.util.Scanner;
public class Main{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int i , j , k , t ;
        boolean b;
        int n = sc.nextInt();
        for(i = 1; i <= n; i++)
        {
            b = true;
            t = (i%2==0)?(k=65):(k=1);
          for(j = 1; j <= (2*n-1); j++)
         {
            if(j >= (n + 1) - i && j <= (n - 1) + i)
            {
                if(b)
                {
                    if(i%2==0)
                    {
                       System.out.printf("%c",k);
                       k++;
                    }
                    else
                    {
                        System.out.print(k);
                        k++;
                    }

                    b = false;
                }
                else
                {
                    System.out.print(" ");
                    b = true;
                }

            }
            else
            {
                System.out.print(" ");
            }
         }
          System.out.print("\n");
        }
    }
}
