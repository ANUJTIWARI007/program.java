import java.util.Scanner;
import java.lang.Math;

class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter factars of equation");

    float a = sc.nextFloat();
    float b = sc.nextFloat();
    float c = sc.nextFloat();
    float e = (b*b-4*a*c);
    double x,y;
    
     if (e<0)
     {
      System.out.println("imagnery number") ;
     }
     else
     {
       x= (-b + Math.sqrt(e));
       x= x/2f*a;
       y= (-b - Math.sqrt(e));
       x= x/2f*a;
       System.out.println(x);
       System.out.println(y);
     }
  }
}


