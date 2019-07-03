package studying.java.statics;

/**
 * Created by echaika on 03.07.2019
 */
class Frog {
    static int frogCount;

    Frog() {
        frogCount += 1;
    }

    static void printFrogs() {
        System.out.println("Frogs now " + getFrogCount());
    }

    static int getFrogCount() {
        return frogCount;
    }

    static void print() {
        System.out.println("Frog");
    }
}

class FrogChild extends Frog {
    // redefinition, can't be overloaded
    static void printFrogs() {
        System.out.println("Parent frogs now " + getFrogCount());
    }

    static void print() {
        System.out.println("FrogChild");
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println("Frog static " + Frog.frogCount);
        new Frog();
        new Frog();
        new Frog();
        Frog f = new Frog();
        System.out.println("Frog count is now " + Frog.frogCount);
        // access static variable using instance 'f'
        int frogs = f.frogCount;
        System.out.println("Frogs " + frogs);
        Frog.printFrogs();
        FrogChild.printFrogs();
        System.out.println("----");
        Frog[] array = {new Frog(), new FrogChild(), new Frog()};
        for (int i = 0; i < array.length; i++) {
            array[i].print();
        }
        FrogChild.print();
        new FrogChild().print();
    }
}
