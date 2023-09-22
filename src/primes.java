public class primes {
    public static void main(String[] args) {
        int min = 10, max = 20, count = 0;
        for (int i = min; i <= max; i++) {
            for (int j = 2; j < i; j++)
                if (i % j == 0) {
                    count = 1;
                    break;
                }
            if (count == 0) {
                System.out.print(i + " ");
            }
            count = 0;
        }
    }
}