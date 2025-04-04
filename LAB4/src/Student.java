public record Student(String name, int group, double grade) {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101, 9.5);
        Student student2 = new Student("Bob", 102, 8.7);
        Student student3 = new Student("Alice", 101, 9.5);

        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
        System.out.println("Student 3: " + student3);

        System.out.println("student1.equals(student2): " + student1.equals(student2));
        System.out.println("student1.equals(student3): " + student1.equals(student3));

        System.out.println("Student 1 name: " + student1.name());
        System.out.println("Student 2 group: " + student2.group());
        System.out.println("Student 3 grade: " + student3.grade());
    }
}