import java.util.*;

public class CarProject {
    public static void main(String[] args) {
        /*dynamic list  */
        List<Car> cars = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        cars.add(new Car("Audi", "tt sport roadster 2.0", 2017));
        cars.add(new Car("Audi","Q3 SUV 2.0", 2022));

        cars.get(0).showCar();
        cars.get(1).showCar();

        cars.set(1, new Car("BMW", "X1", 2023)); //set to modify the products within the lists
        cars.get(1).showCar();

        Car.startCar(cars, sc);
    }
}
