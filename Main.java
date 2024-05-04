import company.exceptions.InvalidAgeException;
import company.beans.Person;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        Messenger messenger = new EmailMessenger();

        Person[] people = new Person[5];
        final int b = 10;

        try {
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("Alice Smith", 50);
            people[2] = new Person("Bob Johnson", 64);
            people[3] = new Person("Emily Brown", 18);
            people[4] = new Person("David Wilson", 124);

            for (int i = 0; i < people.length; i++) {
                int age = people[i].getAge();
                int result = MathUtils.add(age, b);
                String message = "The result of adding " + age + " and " + b + " is " + result;
                messenger.sendMessage(message);
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
