package exception;

public class RacingException {

    public static final String OUT_OF_RANGE_NAME_ERROR = "자동차 이름은 5자 이하만 가능합니다.";
    public static final String NAME_EMPTY_ERROR = "자동차의 이름은 비어있을 수 없습니다.";
    public static final String DUPLICATE_STRING_ERROR = "자동차 이름은 중복될 수 없습니다.";
    public static final String ROUND_NUMBER_ZERO_ERROR = "시도 회수는 1이상 이여야 합니다.";
    
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

    public static class CarNameListDuplicateException extends RuntimeException {
        public CarNameListDuplicateException() {
            super(DUPLICATE_STRING_ERROR);
        }
    }

    public static class RoundNumberZeroException extends RuntimeException {
        public RoundNumberZeroException() {
            super(ROUND_NUMBER_ZERO_ERROR);
        }
    }
}
