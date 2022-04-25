package recursion;

public class ComputingPowers {

    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * power(x, n - 1);
    }

    /**
     * power(10.0, 3) return 10 * 10 * 10 = 1000
     * power(10.0, 2) return 10 * 10
     * power(10.0, 1) return 10 * 1
     * power(10.0, 0) return 1
     */

    public static void main(String[] args) {
        double num = 10.0;
        int n = 3;
        System.out.println(power(num, n));
    }
}
