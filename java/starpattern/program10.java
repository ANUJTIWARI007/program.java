import java.util.Scanner;
public class Main{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int i,j,k = 0;
    for(i = 1; i <= rows; i++)
    {
      if(rows % 2 == 0)
      {
        if(i < rows/2)
          k++;
        if(i > (rows/2)+1)
          k--;
      }
      else
      {
       int s = (i <= (rows+1)/2)?k++:k--;
      }

      for(j = 1; j <= (rows+1)/2; j++)
       {
        if(j <= k)
        {
          System.out.print("*");
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
