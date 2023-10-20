import java.util.*;

public class Area_of_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of Triangle: ");
        int radius = sc.nextInt();
        float area = 0.5f * radius * radius;
        System.out.println("Area of Triangle is : "+ area);
    }
}