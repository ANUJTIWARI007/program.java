import java.util.Scanner;
public class function1{
	     float logic(float f)
	   { 
	   	  float s; 

            s = (f * f * (3.14f));
     
          return s;
	   }
             
	public static void main(String[]args)
	{
		float p;
		Scanner sc = new Scanner(System.in);
		function1 obj = new function1();
		float y = sc.nextFloat();
		p = obj.logic(y);
		System.out.print(p);


	}
}