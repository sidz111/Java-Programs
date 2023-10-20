import java.util.*;

public class BinCoeff {

    public static int fact(int n) {
        int factorial = 1;
        for (int i=1; i<=n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int ncr(int n, int r) {
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);

        int BinCoefficient = fact_n / (fact_r * fact_nmr);
        return BinCoefficient;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int N = sc.nextInt();
        System.out.print("Enter the value of R : ");
        int R = sc.nextInt();
        int ans = ncr(N, R);
        System.out.println("The Binomial Coefficien is: "+ ans);
    }
}