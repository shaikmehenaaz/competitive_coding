import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        int x = 86;
        String a = Integer.toBinaryString(x);
        String reversed = new StringBuilder(a).reverse().toString();

        if (a.equalsIgnoreCase(reversed)) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not palindrome");
        }
    }
}
