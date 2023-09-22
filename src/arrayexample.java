import java.util.*;
import java.io.*;
import java.lang.Math;

public class arrayexample {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements in a array");
        int n=sc.nextInt();
        System.out.println("enter the elements");
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(Arrays.toString(arr));
    }
}
