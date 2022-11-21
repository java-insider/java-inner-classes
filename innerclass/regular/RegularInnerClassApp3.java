package innerclass.regular;

import innerclass.regular.Car.Door;

public class RegularInnerClassApp3 {

    public static void main(String[] args) {

        Car car = new Car();

        Door door = car.new Door();
        door.open();
    }
}
