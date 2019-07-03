package studying.java.literals.hexadecimal;

/**
 * Created by echaika on 03.07.2019
 */
class Test {
    public static void main(String[] args) {
        // hexadecimal integers must start either 0x or 0X and use only 0 1 2 3 4 5 6 7 8 9 a b c d e f
        int x = 0X0001;
        int y = 0x7fffffff;
        int z1 = 0xDeadCafe;
        int z2 = 0xDEADCAFE;
        System.out.println("Hexadecimal integer 0X0001 - " + x);
        System.out.println("Hexadecimal integer 0x7fffffff - " + y);
        // will print the same value
        System.out.println("Hexadecimal integer 0xDeadCafe - " + z1);
        System.out.println("Hexadecimal integer 0xDEADCAFE - " + z2);
    }
}
