import OOP.DB.DB;
import OOP.Persons.Person;
import OOP.transports.Car;

public class Main {
    public static void main(String[] args) {
        printOOPLessonsPart();

//        Truck truck = new Truck(60.0f, 1200.0f, "white", new byte[] {0, 0, 0}, true);
//        truck.engine.info();

//        System.out.println("Truck characteristics:\n" + truck.getFields() + "\n");

        Car car = new Car(200.0f, 600.0f, "purple", new byte[] {0, 0, 0}, true);
        car.setLights(true);
        car.blinkLight();

//        car.engine.info();
//        System.out.println("Car characteristics:\n" + car.getFields());

//        Car flyCar = new Car(200.0f, 600.0f, "purple", new byte[] {0, 0, 0}, true) {
//            @Override
//            public void startMoving() {
//                System.out.println("Car is start flying");
//            }
//        };
//
//        flyCar.startMoving();

//        DB db = new DB();
//        DB.connect();
//        DB.connect("PgSQL");

//        Person person1 = new Person();
//        Person.getCount();
//        Person person2 = new Person();
//        Person person3 = new Person();
//        Person person4 = new Person();
//        Person.getCount();
    }

    public static void printBaseLessonsPart() {
        System.out.println("Базовые уроки по java");
    }

    public static void printOOPLessonsPart() {
        System.out.println("ООП в java");
    }
}