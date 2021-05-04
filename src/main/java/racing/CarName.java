package racing;

import exception.RacingException;

public class CarName {

    private final String name;

    public CarName(String name) {
        this.name = name;
        checkNameLength();
        checkNameEmpty();
    }

    public String getCarName() {
        return name;
    }

    private void checkNameEmpty() {
        if (name.isEmpty()) {
            throw new RacingException.NameEmptyException();
        }
    }

    private void checkNameLength() {
        if (name.length() > 5) {
            throw new RacingException.CarNameOutOfRangeException();
        }
    }
}
