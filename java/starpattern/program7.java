public class Main{
 public static void main(String[]args){
      int j,i;
      boolean k;
      for(i = 1; i <= 5; i++){
         k = true;
      for(j = 1; j <= 9; j++){
         if((j <= 6 - i) || (j >= 4 + i) )
       {
           System.out.print("*");
       }
        else
        {
         System.out.print(" ");
        }
       } 
       System.out.print("\n"); 
       System.out.print("\n");
     }

   }
}
