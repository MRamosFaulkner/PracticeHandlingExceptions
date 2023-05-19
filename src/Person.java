import java.util.Scanner;

public class Person {
    Scanner scanner = new Scanner(System.in);

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.isEmpty() || name.length() > 40 || age < 0 || age > 120) {
            throw new IllegalArgumentException();

        }
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



}
