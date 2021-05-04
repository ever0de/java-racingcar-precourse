import exception.RacingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racing.CarName;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

@DisplayName("단일 자동차 테스트")
public class CarNameTest {

    @ParameterizedTest
    @DisplayName("자동차의 이름이 5초과일 경우 CarNameOutOfRangeException을 내뱉는다.")
    @ValueSource(strings = "test-car")
    void outOfRange(String name) {
        assertThatExceptionOfType(RacingException.CarNameOutOfRangeException.class)
                .isThrownBy(() -> new CarName(name))
                .withMessageMatching(RacingException.OUT_OF_RANGE_NAME_ERROR);
    }

    @ParameterizedTest
    @DisplayName("자동차의 이름이 비어 있을 경우 NameEmptyException을 내뱉는다.")
    @ValueSource(strings = "")
    void empty(String name) {
        assertThatExceptionOfType(RacingException.NameEmptyException.class)
                .isThrownBy(() -> new CarName(name))
                .withMessageMatching(RacingException.NAME_EMPTY_ERROR);
    }
}
