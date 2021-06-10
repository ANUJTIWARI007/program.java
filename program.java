import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("enter two numbers ");
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter number 1");
    int a= sc.nextInt();
     System.out.println(" enter numbers 2");
     int b = sc.nextInt();
     int sum = a+b;
    System.out.println("sum is");
    System.out.println(sum);
    int product = a*b;
        System.out.println("product is");
            System.out.println(product);
            int divide = a/b;
                System.out.println("divide is ");
                    System.out.println(divide);
  }
}
