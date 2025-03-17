package CallByValue;

public class BeispielObjekt {
    String name;

    public BeispielObjekt(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        BeispielObjekt obj = new BeispielObjekt("Hallo");
        bearbeiten(obj);
        System.out.println("Name im Hauptprogramm: " + obj.name); 
        // Ausgabe: Name im Hauptprogramm: Welt
    }

    static void bearbeiten(BeispielObjekt parameter) {
        parameter.name = "Welt"; 
        // Wir ändern das Objekt selbst, 
        // nicht die Referenzvariable 'parameter'.
    }
}

