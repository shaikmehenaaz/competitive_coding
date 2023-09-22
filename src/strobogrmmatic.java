import java.util.Scanner;

public class strobogrmmatic {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println();
        String S=s.nextLine();
        String S1="";
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if(c=='0') S1="0"+S1;
            else if (c=='1') S1="1"+S1;
            else if (c=='8') S1="8"+S1;
            else if (c=='6') S1="9"+S1;
            else if (c=='9') S1="6"+S1;
        }
        if(S.equals(S1)){
            System.out.println("Strobogrammatic");
        }else{
            System.out.println("Not strobogrammatic");
        }
    }
}
