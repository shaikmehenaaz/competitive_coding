public class chinese_reminder_theorem {
    public static void main(String[] args) {
        int num[] = {3, 4, 5};
        int rem[] = {2, 3, 1};
        int k = num.length;
        int x = 1;
        while (true) {
            int j;
            for (j = 0; j < k; j++) {
                if (x % num[j] != rem[j]) {
                    break;
                }
            }
            if (j == k) {
                System.out.println(x);
                break;
            }
            x++;
        }
    }
}
