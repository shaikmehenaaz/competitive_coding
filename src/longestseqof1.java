public class longestseqof1 {
    public static void main(String[] args) {
        int num = 387; // Example decimal number
        int maxCount=0, currentCount=0, prevCount=0;
        while (num > 0) {
            int bit = num & 1;
            if (bit == 1) {
                currentCount++;
            } else {
                if ((num & 2) == 0) prevCount = 0;
                else prevCount = currentCount;
                currentCount = 0;
            }
            maxCount = Math.max(maxCount, currentCount + prevCount + 1);
            num >>= 1;
        }
        System.out.println(maxCount);
    }
}
