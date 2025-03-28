import java.util.HashMap;
import java.util.Map;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class HashMapDeObiecte {
    public static void main(String[] args) {
        // Declarație și inițializare
        HashMap<Integer, Person> people = new HashMap<>();
        people.put(1, new Person("Alice", 30));
        people.put(2, new Person("Bob", 25));
        people.put(3, new Person("Charlie", 35));

        // Parcurgere și afișare
        System.out.println("Parcurgere și afișare a HashMap-ului de obiecte Person:");
        for (Map.Entry<Integer, Person> entry : people.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}