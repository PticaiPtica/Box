package Home55_56;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", 2000, "Red");
        Car car2 = new Car("Lada", 2010, "White");
        Car car3 = new Car("Lada", 2012, "Black");

        Car car4 = new Car("Lada", 2002, "Black");

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        getCar(cars, car4);
        getCar(cars, car1);
    }

    public static Car getCar(List<Car> cars, Car car) {
        try {
            for (Car car1 : cars)
                if (car1.equals(car)) {
                    System.out.println(car1);
                    return car1;

                } else {
                    throw new CarNotFountException();
                }
            return car;
        } catch (CarNotFountException e) {
            System.out.println("«Машина с параметрами как вы искали машину " + car +
                    " в списке не найдена»");
        }
        return null;
    }
}
