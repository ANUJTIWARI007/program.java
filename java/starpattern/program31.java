import java.util.Scanner;
public class Main{
    public static void main(String[]args)
    {
        int i , j , k , t;
        boolean b;
        for(i = 1; i <= 4; i++)
        {
            b = true;
            t = (i%2==0)?(k=65):(k=1);
          for(j = 1; j <= 7; j++)
         {
            if(j >= 5 - i && j <= 3 + i)
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
                System.out.print("#");
            }
         }
          System.out.print("\n");
        }
    }
}
