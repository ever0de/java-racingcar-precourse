package racing;

import java.util.Random;

public class Car {

    private static final int FORWARD_MINIMUM_NUMBER = 4;
    private static final int MAXIMUM_NUMBER = 10;
    private final CarName carName;
    private final CarMileage mileage;

    private static final Random rand = new Random();

    public Car(String name) {
        carName = new CarName(name);
        mileage = new CarMileage();
    }

    public void forward() {
        int number = generateRandomNumber();
        if (isForward(number)) {
            mileage.add();
        }
    }

    public static boolean isForward(int number) {
        return number >= FORWARD_MINIMUM_NUMBER;
    }

    public String getCarName() {
        return carName.getCarName();
    }

    public int getMileageNumber() {
        return mileage.getCarMileage();
    }

    private int generateRandomNumber() {
        return rand.nextInt(MAXIMUM_NUMBER);
    }

}
