import java.util.Scanner;
public class Main {
	public static void main(String[]args){
		System.out.println("factorial program");

Scanner sc=new Scanner(System.in);

System.out.println("enter a number ");

int x = sc.nextInt();

int i ,m = 1;

for(i = 1; i <= x; x--)
{
     m = m * x;
     
}
   System.out.printf("factorial is percent %d",m);
}
}
