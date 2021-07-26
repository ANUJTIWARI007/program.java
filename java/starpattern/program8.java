public class Main{



   public static void main(String[]args)
    {
      int i,j;
      char k;
      for(i = 1; i <= 4; i++)
      { 
         k ='A';

      for(j = 1; j <= 7; j++)
      { if(j <= 5 - i || j >= 3 + i){
        System.out.printf("%c",k);
        int s = j < 4? k++:k--;
       }
       else
       {
         System.out.print(" ");
         if(j == 4)
            k--;
       }

      }
       System.out.print("\n");
    }

   }




}
