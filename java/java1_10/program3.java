import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("enter two numbers ");
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter number 1");
    float a= sc.nextFloat();
     System.out.println(" enter numbers 2");
     float b = sc.nextFloat();
     float sum = a+b;
    System.out.println("sum is");
    System.out.println(sum);
     float product = a*b;
        System.out.println("product is");
            System.out.println(product);
            float divide = a/b;
                System.out.println("divide is ");
                    System.out.println(divide);
  }
}
