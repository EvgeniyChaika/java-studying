package studying.java.constructor.inheritance;

/**
 * Created by echaika on 02.07.2019
 */
class Animal {
    // 1.
    Animal(String value) {
        System.out.println("String parent constructor - " + value);
    }

    // 3.
    Animal() {
        System.out.println("Empty parent constructor");
    }

    // 6.
    static String getName() {
        int x = (int) (Math.random() * 5);
        return new String[]{"Fluffy", "Fido", "Rover", "Spike", "Gigi"}[x];
    }
}

class Horse extends Animal {
    // 5.
    private static final String STATIC = "Static Horse :)";

    // 1. constructor must be matching super
    Horse(String name) {
        super(name);
        System.out.println("String child constructor - " + name);
    }

    // 2. must be empty constructor
    Horse() {
        // 2. call parent String constructor
//        super("default");
        // 3. call empty parent constructor
//        super();
        // 4. call String child constructor
//        this("horse");
//        System.out.println("Empty child constructor");
        // 5. can pass static variables
//        this(STATIC);
        // 6. can pass static methods
//        this(getName());
        this(Animal.getName());
    }

    // 6. 
    static String getName() {
        return "Static method";
    }
//    can't create methods 'this' and 'super'
//    static String this(String val) {
//        return val;
//    }
//
//    static String super(String value) {
//        return value;
//    }
}

class Test {
    public static void main(String[] args) {
//        new Animal("animal");
        // 1.
//        new Horse("horse");
        // 2, 3, 4, 5, 6
        new Horse();
    }
}
