import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonListMain {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String namberString = scanner.nextLine();
        int numberOfPerson = Integer.parseInt(namberString);

        for (int i = 0; i < numberOfPerson; i++) {
            String string = scanner.nextLine();
            String[] strings = string.split(" ");
            String ageString = strings[1];

            int age = Integer.parseInt(ageString);
            String name = strings[0];


            Person person = new Person(name, age);
            list.add(person);


        }
        System.out.println(list);
        int sumAge = 0;
        for (int i = 0; i < list.size(); i++) {
            sumAge += list.get(i).getAge();

        }
        System.out.println(sumAge);
    }

}
