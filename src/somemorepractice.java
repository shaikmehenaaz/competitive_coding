public class somemorepractice {
    static void mymethod(int x){
        System.out.println("hi"+x);
        System.out.println("hey hi");
    }
    int x=5;
    String fname="shaik";
    String lname="Mehenaaz";
    public static void main(String args[]){
        somemorepractice obj=new somemorepractice();
        somemorepractice obj1=new somemorepractice();
        obj.x=20;
        System.out.println(obj.x+" . My name is "+obj.fname+" "+obj1.lname);
        System.out.println(obj1.x);
        mymethod(5);
}
}

