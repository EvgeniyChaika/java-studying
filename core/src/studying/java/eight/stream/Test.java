package studying.java.eight.stream;

import java.util.Arrays;

/**
 * Created by echaika on 09.04.2019
 */
public class Test {
    private static int[] getDivisors(int[] array) {
        return Arrays.stream(array)
                .peek(e -> System.out.println("ass " + e))
                .distinct()
                .sorted()
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getDivisors(new int[]{10, 87, 97, 43, 121, 20, 97})));
    }
}
