public class smalllarge {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7,8,9,2};
        int small=arr[0];
        int large=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large = arr[i];
            }else if(arr[i]<small){
                small = arr[i];
            }
        }
        System.out.println(small);
        System.out.println(large);
    }
}
