public class Main{
  public static void main(String[]args)
  {
    int i,j,k,s;
    for(i = 1; i <= 6; i++)
    {
      k = 1;
       for(j = 1; j <= 6; j++)
      {
        if(j <= i)
        {
              System.out.printf("%d",k);
              s = (k == 1)?k--:k++;
        }
        else
          System.out.print(" ");
      } 
      System.out.print("\n");
   }
  }
}
