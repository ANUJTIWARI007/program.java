import java.util.Scanner;
public class Main {
	public static void main(String[]args){
		System.out.println("table program");
		
Scanner sc=new Scanner(System.in);

System.out.println("enter a number ");

int x = sc.nextInt();

int i ,m ;

for(i = 1; i <= 10; i++)
{
     m = x * i;
     System.out.println(m);
}

}
}
