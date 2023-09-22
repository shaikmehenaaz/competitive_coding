public class nibble {
    public static void main(String[] args) {
        int n=100;
        String s=Integer.toBinaryString(n);
        String s1="";
        if(s.length()<8){
            for(int i=s.length();i<8;i++){
                s='0'+s;
            }
        }
        for(int i=4;i<8;i++){
            s1=s1+s.charAt(i);
        }
        for(int i=0;i<4;i++){
            s1=s1+s.charAt(i);
        }
        System.out.println(Integer.parseInt(s1,2));
    }
}
