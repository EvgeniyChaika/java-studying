package studying.java.constructor.inheritance;

/**
 * Created by echaika on 02.07.2019
 */
class Animal {
    // 1.
    Animal(String name) {
        System.out.println("String parent constructor - " + name);
    }

    // 3.
    Animal() {
        System.out.println("Empty parent constructor");
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
        this(print());
    }

    // 6. 
    private static String print() {
        return "Static method";
    }
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
