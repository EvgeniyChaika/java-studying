package studying.java.enums.main;

/**
 * Created by echaika on 18.11.2018
 */
public class Jacket {

    private String name;

    private ColorJacket color;

    public Jacket(String name, ColorJacket color) {
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
