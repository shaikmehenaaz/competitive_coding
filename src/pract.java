public class pract {
    public static void main(String[] args) {
        /*byte i=0;
        do {
            System.out.println("i am a very good girl");
            i++;
        }while(i<5);
        for(int i=0;i<=2;i++){
            System.out.print(" outer: "+i);
            for(int j=1 ;j<=2;j++){
                System.out.print(" "+j);
            }
        }
        String[] cars={"volvo","BMW","Hyundai"};
        for(String i : cars){
            System.out.println(i);
        }
        for(int i=0;i<5;i++){
            if(i==4){
                continue;
            }
            System.out.println(i);
        }
        int[] nums={1,2,3,4,5,  5};
        for(int i:nums){
            System.out.println(i);
        }
        System.out.println(nums.length);
        for(int i=0;i< nums.length;i++){
            System.out.println(nums[i]);
        }*/
        int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
        //System.out.println(nums[1][1]);
        for(int i=0;i< nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.println(nums[i][j]);
            }
        }
    }
}
