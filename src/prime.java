import org.w3c.dom.ls.LSOutput;

public class prime {

    public static void main(String[] args) {
        int num = 12, count = 0;
        for(int i=2;i<num;i++)  {
                if (num % i  == 0) {
                    count++;
            }
        }
        if (count>0){
            System.out.print("not prime");
        }else{
            System.out.println("prime");
        }
    }
}
