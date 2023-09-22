import java.util.Scanner;

public class nowvote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading the age

        if (age >= 18) {
            System.out.println(age + " years old are eligible for voting!");
            System.out.println("The available parties are:");
            System.out.println("  a) TDP");
            System.out.println("  b) NOTA");
            System.out.println("  c) JANASENA");
            System.out.println("  d) YSR");
            System.out.print("Choose and enter an option: ");
            String opt = sc.nextLine();

            String a = "TDP", b = "NOTA", c = "JANASENA", d = "YSR";

            if (opt.equals(a) || opt.equals(b) || opt.equals(c) || opt.equals(d)) {
                System.out.println("You've voted for " + opt);
            } else {
                System.out.println("Invalid party option!");
            }
        } else if (age > 0) {
            System.out.println(age + " years old are not eligible for voting!");
        } else {
            System.out.println("Invalid age entered!");
        }

        sc.close(); // Close the scanner at the end of the program
    }
}
