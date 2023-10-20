import java.util.*;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int add = a+b;
        int sub = a-b;
        int div = a/b;
        int mult = a*b;
        System.out.println("The Addition of "+a+ " and "+b+ " is "+add);
        System.out.println("The substraction of "+a+ " and "+b+ " is "+sub);
        System.out.println("The division of "+a+ " and "+b+ " is "+div);
        System.out.println("The multiplication of "+a+ " and "+b+ " is "+mult);
    }
}