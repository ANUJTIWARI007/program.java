public class Main{
   public static void main(String[]args){
      int j,i;
      for(i = 5; i >= 1; i--)
    {
      for(j = 1; j <= 5; j++)
      {
         if(j >= i)
         System.out.print("*");
         else
            System.out.print(" ");
      }
      System.out.print("\n");
    }
   }
}
