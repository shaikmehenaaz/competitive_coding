public class summing {
    static void sum(int[]arr,int x){
        for(int i=0;i<(arr.length+1)/2;i++)
            for(int j=0;j<arr.length;j++)
                if(arr[i]+arr[j]==x && i!=j){
                System.out.println(arr[i]+","+arr[j]);
            }
    }
    public static void main(String[] args) {
        int[] arr ={5,7,1,2,8,4,3};
        int x=10;
        sum(arr,x);
    }
}
