public class Main{
  public static void main(String[]args)
  {
    int i,j,k,s;
    for(i = 1; i <= 4; i++)
    {
      s = 1;
      k = 65;
       for(j = 1; j <= 7; j++)
      {
        if(j >= 5 - i && j <= 3 + i)
        {
          if(j <= 4)
          {
              System.out.printf("%d",s);
              s++;
          }
          else
          {
            System.out.printf("%c",k);
            k++;
          }
        }
        else
          System.out.print(" ");
      } 
      System.out.print("\n");
   }
  }
}
