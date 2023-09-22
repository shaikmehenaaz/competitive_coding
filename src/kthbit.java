import java.util.*;
public class kthbit {

    static void result(int x,int k){
        String S=Integer.toBinaryString(x);
        if(S.charAt(k)==0){
            System.out.println("set");
        }else{
            System.out.println("not set");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int x=sc.nextInt();
        System.out.println();
        int k=sc.nextInt();
        result(x,k);
    }
}
