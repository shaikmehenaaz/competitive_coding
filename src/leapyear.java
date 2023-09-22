public class leapyear {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1900; i < 2023; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                System.out.printf("%d ", i);
                count++;
                System.out.println();
            }
        }
    }
}
