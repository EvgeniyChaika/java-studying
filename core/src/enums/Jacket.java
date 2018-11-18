package enums;

/**
 * Created by echaika on 18.11.2018
 */
public class Jacket {

    private String name;

    private Color color;

    public Jacket(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Jacket{" +
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}
