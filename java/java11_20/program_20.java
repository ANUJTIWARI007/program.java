import java.util.Scanner;

class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");

    int a = sc.nextInt();
    
     if (a%5==0)
     {
       System.out.printf("%d is divisble by 5",a);
     }
     else
     {
       System.out.printf("%d is not divisble by 5",a);
     }
  }
}


