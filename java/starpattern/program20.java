public class Main{
  public static void main(String[]args)
  {
    int i,j;
    for(i = 1; i <= 4; i++)
    {
       for(j = 1; j <= 8; j++)
      {
        if(j >= 5 - i && j <= 9 i)
        {
          System.out.print("*");
        }
        else
          System.out.print(" ");
      } 
      System.out.print("\n");
   }
  }
}
