
package studying.java.initializationblocks;

/**
 * Created by echaika on 03.07.2019
 */
class Parent2 {
    Parent2(int x) {
//      // 2.7
        // 3.7
        super();
        // 2.10
        // 3.10
        System.out.println("1-arg parent2 constructor");
    }

    Parent2() {
        // 1.7
        super();
        // 1.10
        System.out.println("no-arg parent2 constructor");
    }

    // 1.1
    // 2.1
    // 3.1
    static {
        System.out.println("1st parent2 static init");
    }

    // init blocks will call right after the call to 'super()' in the constructor
    // 1.8
    // 2.8
    // 3.8
    {
        System.out.println("1st parent2 instance init");
    }

    // 1.9
    // 2.9
    // 3.9
    {
        System.out.println("2st parent2 instance init");
    }

    // 1.2
    // 2.2
    // 3.2
    static {
        System.out.println("2st parent2 static init");
    }
}

class Parent1 extends Parent2 {
    Parent1(int x) {
        // 2.11
        // 3.11
        super(x);
        // 2.14
        // 3.14
        System.out.println("1-arg parent1 constructor");
    }

    Parent1() {
        // 1.11
        super();
        // 1.14
        System.out.println("no-arg parent1 constructor");
    }

    // 1.3
    // 2.3
    // 3.3
    static {
        System.out.println("1st parent1 static init");
    }

    // init blocks will call right after the call to 'super()' in the constructor
    // 1.12
    // 2.12
    // 3.12
    {
        System.out.println("1st parent1 instance init");
    }

    // 1.13
    // 2.13
    // 3.13
    {
        System.out.println("2st parent1 instance init");
    }

    // 1.4
    // 2.4
    // 3.4
    static {
        System.out.println("2st parent1 static init");
    }
}

class Child extends Parent1 {
    Child(int x) {
        // 2.15
        // 3.15
        super(x);
        // 2.18
        // 3.18
        System.out.println("1-arg child constructor");
    }

    Child() {
        // 1.15
        super();
        // 1.18
        System.out.println("no-arg child constructor");
    }

    // 1.5
    // 2.5
    // 3.5
    static {
        System.out.println("1st child static init");
    }

    // init blocks will call right after the call to 'super()' in the constructor
    // 1.16
    // 2.16
    // 3.16
    {
        System.out.println("1st child instance init");
    }

    // 1.17
    // 2.17
    // 3.17
    {
        System.out.println("2st child instance init");
    }

    // 1.6
    // 2.6
    // 3.6
    static {
        System.out.println("2st child static init");
    }
}

class Test {
    public static void main(String[] args) {
        // 1.
//        Parent2 parent2 = new Child();
        // 2.
//        Parent2 parent2Int = new Child(7);
        // 3.
        Parent1 parent1Int = new Child(7);
    }
}
