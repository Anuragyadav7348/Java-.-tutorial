import java.util.*;

public class  Practice1  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age:");
        if (sc.hasNextInt()) {
            int age = sc.nextInt();
            if (age < 0) {
                System.out.println("Age cannot be negative.");
            } else if (age > 18) {
                System.out.println("adult");
            } else {
                System.out.println("not adult");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid age.");
        }

        sc.close(); // Close scanner to avoid resource leaks
    }
}