package studying.java.exception.error.stackoverflow;

/**
 * Created by echaika on 01.10.2019
 */
class Human {
    Human d = new Human();

    Car car = new Car();

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.car.speed);
    }
}
