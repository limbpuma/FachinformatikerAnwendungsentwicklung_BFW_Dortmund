package CallByValue;

public class Person {
    String name;

    Person(String name) {
        this.name = name;
    }


    public class ObjectTest {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        System.out.println("Vorher: " + person.name);

        changeName(person); // Korrekte Methode aufrufen

        System.out.println("Nachher: " + person.name);
    }

    static void changeName(Person p) { // Name korrigiert
        p.name = "Bob"; // Ändert das Objekt, auf das die Referenz zeigt
    }
}
}