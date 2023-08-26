package OOP.DB;

public class DB {
    public static void connect() {
        System.out.println("You connected to MySQL");
    }

    public static void connect(String driver) {
        System.out.println("You connected to " + driver);
    }
}
