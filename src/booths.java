public class booths {
    public static void main(String args[]){
        int a = 9;
        int b = 8;
        int ans = 0;
        while (b > 0) {
            if ((b & 1) == 1) {
                ans += a;
            }
            b >>= 1;
            a <<= 1;
        }
        System.out.println(ans);
    }
}
