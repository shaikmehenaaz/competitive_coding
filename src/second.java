class Second {
    public static void main(String[] args) {
        // create an object of the Student class (which inherits attributes and methods from Main)
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // call abstract method
        study myobject=new study();
        String ok=myobject.getMynamee();
        myobject.setMyage(19);
        //System.out.println(myobject.setMyage());
        Vehicle myob=new Car();
        myob.honk();
    }
}