import java.util.*;
public class voting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        System.out.println("The available parties are :");
        System.out.println("  a) TDP");
        System.out.println("  b) NOTA");
        System.out.println("  c) JANASENA");
        System.out.println("  d) YSR \n");
        if (age >= 18){
            System.out.println(age + " yrs old are eligible for Voting! ");
            System.out.println("Choose and enter an option : ");
            String opt = sc.nextLine();
            sc.nextLine();
            System.out.println(opt);
            String a = "TDP" , b = "NOTA", c = "JANASENA", d= "YSR";
            if(opt.equals(a) || opt.equals(b) || opt.equals(c) || opt.equals(d)){
                System.out.println("You've voted for " + opt);
            }
        }
        else if (age > 0){
            System.out.println(age + " are not eligible for Voting!");
        }
        else if (age < 0){
            System.out.println(age + " Entered age is invalid.");
        }
    }
}