//import java.util.Scanner;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    //ex1
////    public static void main(String[] args) {
////    Room room = new Room(5.0,7.0);
////    Owner owner = new Owner("Mihaitza D");
////    House house = new House("Str.Milmoiesti", room, owner);
////    room.width = 15.7;
////    owner.name = "Vasilica L";
////    System.out.println(house.address);
////    System.out.println("Dining Room dimensions: " + house.diningRoom.width + " x " + house.diningRoom.length);
////    System.out.println(house.owner.name);
////    }
//
//    //ex2
//
////    Exercițiul 2 – Suprascrierea Metodelor din Clasa Object
////    Cerințe:
////
////    Creează o clasă Person cu următoarele atribute:
////    String name
////    int age
////    Suprascrie metodele din clasa Object:
////    toString() – returnează un șir reprezentativ, de exemplu: "Person{name='John', age=30}"
////    equals(Object o) – compară două obiecte Person pe baza valorilor atributelor.
////    hashCode() – generează un cod hash consistent cu equals().
////    În metoda main, creează două instanțe de Person cu aceleași valori și demonstrează:
////    Că equals() returnează true.
////    Că hashCode-ul este același.
////    Afișarea cu toString().
////    public static void main(String[] args) {
////        Person person1 = new Person("Mihaita D", 69);
////        Person person2 = new Person("Vasile L", 69);
////        System.out.println(person1.equals(person2));
////        System.out.println(person1.hashCode());
////        System.out.println(person2.hashCode());
////        System.out.println("person1: " + person1);
////        System.out.println("person2: " + person2);
////    }
//
////    Exercițiul 3 – Crearea unei Clase Imutabile
////    Cerințe:
////
////    Definește o clasă imutabilă ImmutablePoint care reprezintă un punct cu coordonate:
////    Atribute:
////    private final double x
////    private final double y
////    Reguli:
////    Clasa trebuie să fie final.
////    Atributele sunt private și finale.
////    Nu se definesc setteri, doar un constructor parametrizat și metode getter.
////    În metoda main, creează un obiect ImmutablePoint și demonstrează că valorile nu se pot modifica după crearea obiectului.
//
//    public static void main(String[] args) {
//        ImmutablePoint point = new ImmutablePoint(6, 9);
//        System.out.println("point coordinates: " + point.getX() + " " + point.getY());
//    }
//
//}
//


public class Main {
    public static void main(String[] args) {
        Address address = new Address("New York", "5th Avenue");
        Owner owner = new Owner("John Doe", 45);
        House house = new House(address, owner);

        Student student1 = new Student("Alice", 101, 9.5);
        Student student2 = new Student("Bob", 102, 8.7);

        StringBuilder report = new StringBuilder();
        report.append("House Information:\n");
        report.append(house).append("\n\n");

        report.append("Students Information:\n");
        report.append(student1).append("\n");
        report.append(student2).append("\n");

        System.out.println(report.toString());
    }
}