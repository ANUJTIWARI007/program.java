import java.util.Scanner;
public class Main {
	public static void main(String[]args){
		System.out.println("Sum of ood number program");

Scanner sc=new Scanner(System.in);

System.out.println("enter a number ");

int x = sc.nextInt();

int i ,m = 0;
long E = 0;

for(i = 1; i <= x; i++)
{
     m = 2 * i - 1;
     E = E + m;
     
}
   System.out.printf("sum of ood number is %d",E);
}
}
