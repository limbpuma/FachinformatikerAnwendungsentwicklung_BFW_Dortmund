package CallByValue;

public class PrimitiveDemo {
    public static void main(String[] args) {
        int a = 5;
        aender(a);
        System.out.println("Wert in main = " + a); // 5
    }

    static void aender(int x) {
        x = 99; // Beeinflusst 'a' nicht
    }
}

