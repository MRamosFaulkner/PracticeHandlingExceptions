import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Validating parameters
        try {
            Person person = new Person(name);
            System.out.println("Name: " + person.getName());

            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Not a valid name");
        }

    }

    //Sensors and Temperature
    application.StandardSensor;
    StandardSensor ten = new StandardSensor(10);
    StandardSensor minusFive = new StandardSensor(-5);

        System.out.println(ten.read());
        System.out.println(minusFive.read());

        System.out.println(ten.isOn());
        ten.setOff();
        System.out.println(ten.isOn());




}
