import java.util.Scanner;

class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int a = sc.nextInt();
    
    if(a%2==0)
    {
      System.out.printf(" %d is even number",a);
    }
    else
    {
      System.out.printf("%d is odd number ",a);
    }

  

  }

}


