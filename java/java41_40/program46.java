import java.util.Scanner;

public class Main{
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      System.out.println("two bit sat program");

      System.out.println("enter a number");
      
      int n = sc.nextInt();
      int i,j;

      for(i = 2; n > 0; i = i * 2)
      {
         for(j = 1; j < i; j = j * 2)
         {  
            System.out.printf("\n%d",i+j);
            n--;
            if(n == 0)
               break;
         }

      }


   }
}
