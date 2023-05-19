import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Validating parameters
        try {
            System.out.println("Enter name: ");
            String name = scanner.nextLine();

            System.out.println("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            Person person = new Person(name,age);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

        } catch (IllegalArgumentException e) {
            System.out.println("Not a valid");
        }

        scanner.close();

    }

}
