class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class ArrayDeObiecte {
    public static void main(String[] args) {
        // Declarație și inițializare
        Student[] students = new Student[3];
        students[0] = new Student("Alice", 20);
        students[1] = new Student("Bob", 22);
        students[2] = new Student("Charlie", 21);

        // Parcurgere și afișare
        System.out.println("Parcurgere și afișare a array-ului de obiecte Student:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}