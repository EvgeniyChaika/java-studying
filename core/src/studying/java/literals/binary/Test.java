package studying.java.literals.binary;

/**
 * Created by echaika on 03.07.2019
 */
class Test {
    public static void main(String[] args) {
        // binary integers must start either 0B or 0b and use only 0 and 1
        int fortyTwo = 0B101010;
        int three = 0b00011;
        System.out.println("Binary integer 0B101010 - " + fortyTwo);
        System.out.println("Binary integer 0b00011 - " + three);
    }
}
