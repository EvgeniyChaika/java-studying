package studying.java.enums.inside;

/**
 * Created by echaika on 23.04.2019
 */
public class Main {
    public static void main(String[] args) {
        Coffee drink = new Coffee();
        drink.size = Coffee.CoffeeSize.BIG;
        System.out.println(drink.size);
    }
}
