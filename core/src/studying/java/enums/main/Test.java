package studying.java.enums.main;

import studying.java.enums.Color;
import studying.java.enums.Jacket;

/**
 * Created by echaika on 18.11.2018
 */
public class Test {

    public static void main(String[] args) {
        Jacket jacket1 = new Jacket("Montana", Color.BLACK);
        Jacket jacket2 = new Jacket("Lewis", Color.WHITE);
        Jacket jacket3 = new Jacket("H&M", Color.RED);
        System.out.println(jacket1);
        System.out.println(jacket2);
        System.out.println(jacket3);
    }
}
