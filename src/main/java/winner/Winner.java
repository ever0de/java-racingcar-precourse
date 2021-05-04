package winner;

import racing.Car;
import racing.CarList;

import java.util.ArrayList;
import java.util.List;

public class Winner {

    private static final String WINNER_MESSAGE = "가 최종 우승했습니다.";
    private static final String DELIMITER = ",";
    private final List<String> nameList = new ArrayList<>();
    private final WinnerNumber number = new WinnerNumber();

    public void updateWinnerNumber(Car car) {
        int carMileage = car.getMileageNumber();
        if (number.isBiggerThanWinnerNumber(carMileage)) {
            number.swapWinnerNumber(carMileage);
        }
    }

    public void addWinnerName(Car car) {
        if (checkWinner(car)) {
            nameList.add(car.getCarName());
        }
    }

    public boolean checkWinner(Car car) {
        return car.getMileageNumber() == number.getWinnerNumber();
    }

    public String getWinnerNameList(CarList cars) {
        for (Car car : cars.getCars()) {
            addWinnerName(car);
        }
        return String.join(DELIMITER, nameList);
    }

    public void printWinners(CarList cars) {
        System.out.println("\n" + getWinnerNameList(cars) + WINNER_MESSAGE);
    }
}
