public class Main{
  public static void main(String[]args)
  {
    int i,j;
    for(i = 1; i <= 7; i++)
    {
      for(j = 1; j <= 7; j++)
      {
          if(i == 1 || i == 7)
          {
            System.out.print("*");
          }
            else   
           { 
              if(i == 2 || i == 6)
              {
                 if(j == 1 || j == 7)
                {
                    System.out.print("*");
                }
                 else
                 {
                   System.out.print(" ");
                 }  
              }
                 if(i == 3 || i == 5)
                 {
                    if(j == 2 || j == 6)
                    {
                      System.out.print(" ");
                    }
                    else
                    {
                      System.out.printf("*");
                    }
                 }
                 if(i == 4)
                 {
                  if(j == 1 || j == 3 || j == 5 || j == 7)
                    System.out.print("*");
                  else
                    System.out.print(" ");
                 }

                 
            }
          
      }
      System.out.print("\n");
    }  
  }
}



