import java.util.*;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number here : ");
        int num = sc.nextInt();
        int count = 0;

        for (int i=1; i<=num; i++) {
            if (num % i == 0) {
                count++;
                if (count == 3){
                    break;
                }
            }
        }
        if (count == 2) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
            
        }
    }
}