import java.util.*;
public class strobo{
    public static ArrayList<String> StrobogrammaticNum(int n){
        return numDef(n,n);
    }
    public static ArrayList<String> numDef(int n, int length){
        if(n==0) return new ArrayList<>(List.of(""));
        if(n==1) return new ArrayList<>(Arrays.asList("1", "0", "8"));

        ArrayList<String> middles = numDef(n - 2, length);
        ArrayList<String> result = new ArrayList<>();

        for(String middle: middles){
            if(n != length)
                result.add("0" + middle + "0");
            result.add("8" + middle + "8");
            result.add("1" + middle + "1");
            result.add("9" + middle + "6");
            result.add("6" + middle + "9");
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(StrobogrammaticNum(3));
    }

}