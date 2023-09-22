public class KaratsubaAlgorithm {

    public static long karatsuba(long x, long y) {
        if (x < 10 || y < 10) {
            return x * y;
        }

        // Calculate the size to split the numbers approximately in half
        int n = Math.max(getNumDigits(x), getNumDigits(y));
        int half = (n + 1) / 2;

        // Split the numbers into two halves
        long powerOfTen = (long) Math.pow(10, half);
        long xLow = x % powerOfTen;
        long xHigh = x / powerOfTen;
        long yLow = y % powerOfTen;
        long yHigh = y / powerOfTen;

        // Recursive calls
        long a = karatsuba(xHigh, yHigh);
        long b = karatsuba(xLow + xHigh, yLow + yHigh);
        long c = karatsuba(xLow, yLow);

        // Combine the results using the Karatsuba formula
        return a * (long) Math.pow(10, 2 * half) + (b - a - c) * powerOfTen + c;
    }

    public static int getNumDigits(long num) {
        return (int) Math.log10(num) + 1;
    }

    public static void main(String[] args) {
        long x = 123456789;
        long y = 987654321;

        long result = karatsuba(x, y);
        System.out.println("Result: " + result);
    }
}
