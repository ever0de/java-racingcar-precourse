package racing;

import exception.RacingException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarNameList {

    private final List<String> nameList = new ArrayList<>();

    public void add(String name) {
        nameList.add(name);
        checkDuplicateName();
    }

    public CarList toCarList() {
        CarList cars = new CarList();
        for (String name : nameList) {
            Car car = new Car(name);
            cars.add(car);
        }
        return cars;
    }

    private void checkDuplicateName() {
        Set<String> set = new HashSet<>(nameList);
        if (set.size() != nameList.size()) {
            throw new RacingException.CarNameListDuplicateException();
        }
    }
}
