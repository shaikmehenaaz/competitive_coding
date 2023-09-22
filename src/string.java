public class string {
    public static void main(String[] args) {
        String str="I love my roommates";
        int cnt=1;
        int l=str.length();
        for(int i=0;i<l;i++){
            if(str.charAt(i)==' '){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
