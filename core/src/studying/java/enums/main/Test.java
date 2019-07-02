package studying.java.enums.main;

/**
 * Created by echaika on 18.11.2018
 */
public class Test {

    public static void main(String[] args) {
        Jacket jacket1 = new Jacket("Montana", ColorJacket.BLACK);
        Jacket jacket2 = new Jacket("Lewis", ColorJacket.WHITE);
        Jacket jacket3 = new Jacket("H&M", ColorJacket.RED);
        System.out.println(jacket1);
        System.out.println(jacket2);
        System.out.println(jacket3);
    }
}
