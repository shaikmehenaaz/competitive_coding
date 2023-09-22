import java.util.Scanner;
public class long1seq {
    public static void main(String[] args) {
        Scanner sw=new Scanner(System.in);
        int num = sw.nextInt();
        String s = Integer.toBinaryString(num);
        System.out.println(s);
        int max = 0;
        int current = 0;
        int previous = 0;
        for (int i=0;i<s.length();i++) {
            char chr=s.charAt(i);
            if (chr == '1') {
                current++;
                if(current==s.length()) {
                    max=current;
                    System.out.println(max);
                    System.exit(0);
                }
            } else {
                max = Math.max(max, current + previous + 1);
                previous = current;
                current = 0;
            }
        }
        max = Math.max(max, current + previous+1);
        System.out.println(max);
    }
}