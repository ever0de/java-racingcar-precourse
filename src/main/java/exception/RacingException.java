package exception;

public class RacingException {

    public static final String OUT_OF_RANGE_NAME_ERROR = "자동차 이름은 5자 이하만 가능합니다.";
    public static final String NAME_EMPTY_ERROR = "자동차의 이름은 비어있을 수 없습니다.";

    public static class CarNameOutOfRangeException extends RuntimeException {
        public CarNameOutOfRangeException() {
            super(OUT_OF_RANGE_NAME_ERROR);
        }
    }

    public static class NameEmptyException extends RuntimeException {
        public NameEmptyException() {
            super(NAME_EMPTY_ERROR);
        }
    }
}
