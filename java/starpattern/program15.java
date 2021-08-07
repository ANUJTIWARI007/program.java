public class Main{
  public static void main(String[]args){
    int i,j;
    for(i = 1; i <= 7; i++)
    {
    for(j = 1; j <= 7; j++)
    {
      if( i == j || i == 8 - j)
      {
         if(i == j)
          System.out.print("\\");
        else
          System.out.printf("/");
      }
      else
       System.out.print("*");
      
    }
    System.out.print("\n");
   }
  }
}
