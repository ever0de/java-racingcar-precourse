package racing;

import exception.RacingException;

public class RoundNumber {

    private final int roundNumber;

    public RoundNumber(int number) {
        roundNumber = number;
        checkRoundNumberIsZero();
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    private void checkRoundNumberIsZero() {
        if (roundNumber == 0) {
            throw new RacingException.RoundNumberZeroException();
        }
    }
}
