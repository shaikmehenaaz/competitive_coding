public class lucas {
    public static void main(String[] args) {
        int n=5;
        int a=0,b=1,c=1;
        //System.out.print(a+" "+b+" "+c+" ");
        for(int i=0;i<=n;i++){
            int d=a+b+c;
            a=b;
            b=c;
            c=d;
            //System.out.print(c+" ");
        }
        System.out.println(c);
    }
}
