import java.util.Arrays;
import java.util.Scanner;

public class missingnumber {

    public static int missednum(int[] arr) {
        int n = arr.length + 1;
        int expectedsum = n * (n + 1) / 2;
        int actualsum = 0;
        for (int num : arr) {
            actualsum += num;
        }
        int missednum=expectedsum-actualsum;
        return missednum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        int missingnumber=missednum(arr);
        System.out.println(missingnumber);

        sc.close();
    }
}
