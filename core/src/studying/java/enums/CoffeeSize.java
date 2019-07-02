package studying.java.enums;

/**
 * Created by echaika on 23.04.2019
 */
public enum CoffeeSize {
    BIG(8), HUGE(10), OVERWHELMING(16);

    private final int ounces;

    CoffeeSize(int ounces) {
        this.ounces = ounces;
    }

    public int getOunces() {
        return ounces;
    }
}
