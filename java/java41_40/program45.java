import java.util.Scanner;

public class Main{
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int x = 3,y,count;

      System.out.println("two bit set program");

      System.out.println("number of set u want");
      int n = sc.nextInt();

      while(n > 0)
      {
         y = x;
         count = 0;
         while(y > 0)
         {
            if(y % 2 == 1)
               count++;
            y = y / 2;
         }
         if(count == 2)
        {
            System.out.printf("\n%d",x);
            n--;
        }
        x++;
      }


   }
}
