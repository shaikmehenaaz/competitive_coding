import java.util.*;

public class anagram {
    public static void main(String[] args) {
        String S1="Rescue",S2="Secure";
        S1=S1.toLowerCase();
        S2=S2.toLowerCase();
        if(S1.length()==S2.length()){
            char[] arr1=S1.toCharArray();
            char[] arr2=S2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1,arr2)){
                System.out.println("anagrams");
            }else{
                System.out.println("not anagram");
            }
        } else {
            System.out.println("not anagram");
        }
    }
}
