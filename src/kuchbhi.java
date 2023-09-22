
public class kuchbhi {
    public static void main(String[] args) {
        int count=0,num=4567345;
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    static void fibonacci(int count){
        int firstTerm=0,secondTerm=1;

        while(firstTerm<=count){
            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
        System.out.println(     );
    }
    static void pattern(int n){
        for(int row = 0; row<2*n; row++){
            int totalColsInRow= row > n ? 2 * n - row : row;
            for(int col=0;col<totalColsInRow;col++){
                System.out.print(col+" ");
            }
            System.out.println( );
        }
    }
}
