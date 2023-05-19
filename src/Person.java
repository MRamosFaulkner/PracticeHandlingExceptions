import java.util.Scanner;

public class Person {
    Scanner scanner = new Scanner(System.in);

    private String name;

    public Person(String name) {
        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Name not valid");

        }
        this.name = name;
        System.out.println("Name: " + name);
    }

    public String getName() {
        return name;
    }



}
