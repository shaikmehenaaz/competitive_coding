public class create {
    static void mymethod() {
        System.out.println("this is my method");
    }

    public static void main(String[] args) {
        mymethod();
        anothermethod("joseph", 2);
        System.out.println(onemoremethod(5));
        checkage(20);
        System.out.println(add2num(2,3));
        System.out.println(add2num(2.2,3.3));
        //System.out.println(x);
        int x=10;
        System.out.println(x);
        System.out.println(sum(10));
        System.out.println(add(2,5));
    }

    static void anothermethod(String fname, int age) {
        System.out.println(fname + " roberto" + " is " + age);
    }

    static int onemoremethod(int x) {
        return x * 5;
    }

    static void checkage(int age) {
        if (age < 18) {
            System.out.println("not eligible to vote");
        } else {
            System.out.println("good to vote");
        }
    }
    static int add2num(int x,int y){
        return x+y;
    }
    static double add2num(double x,double y){
        return x+y;
    }
    public static int sum(int k){
        if(k>0){
            return k+sum(k-1);
        }else {
            return 0;
        }
    }
    public static int add(int start,int end){
        if(end>start){
            return end+add(start,end-1);
        }else{
            return end;
        }
    }
}
