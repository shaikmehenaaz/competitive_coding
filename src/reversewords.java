public class reversewords {
    static void reverse(String S1){
        String s2="";
        String s[]=S1.split(" ");
        for(int i=s.length-1;i>=0;i--){
            s2+=s[i]+" ";
        }
        System.out.println(s2);
    }

    public static void main(String[] args) {

        String S1="My name is Mehenaaz";
        reverse(S1);
    }
}
