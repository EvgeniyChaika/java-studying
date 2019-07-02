package studying.java.tasks;

/**
 * Created by echaika on 30.04.2019
 */
public class Shuttle extends Rocket {
    public static void main(String[] args) {
        new Shuttle().go();
    }

    private void go() {
        blastOff();
//        Rocket.blastOff();
    }

    private void blastOff() {
        System.out.println("sh-bang ");
    }
}

class Rocket {
    private void blasOff() {
        System.out.println("bang ");
    }
}
