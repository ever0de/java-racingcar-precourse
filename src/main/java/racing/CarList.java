package racing;

import winner.Winner;

import java.util.ArrayList;
import java.util.List;

public class CarList {

    private static final String DASH = "-";
    private static final String DELIMITER = "";
    private final List<Car> cars = new ArrayList<>();

    public void add(Car car) {
        cars.add(car);
    }

    public void moveCars(Winner winner) {
        for (Car car : cars) {
            car.forward();
            winner.updateWinnerNumber(car);
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public void printResult() {
        System.out.println();
        for (Car car : cars) {
            String name = car.getCarName();
            String dash = numberToDashString(car.getMileageNumber());
            System.out.println(name + " : " + dash);
        }
    }

    private String numberToDashString(Integer number) {
        List<String> dashList = new ArrayList<>();
        for (int index = 0; index < number; index++) {
            dashList.add(DASH);
        }
        return String.join(DELIMITER, dashList);
    }
}
