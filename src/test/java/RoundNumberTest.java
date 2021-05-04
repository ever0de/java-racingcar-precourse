import exception.RacingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.RoundNumber;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class RoundNumberTest {

    @Test
    @DisplayName("RoundNumber가 0이라면 RoundNumberZeroException을 내뱉는다.")
    void zero() {
        assertThatExceptionOfType(RacingException.RoundNumberZeroException.class)
                .isThrownBy(() -> new RoundNumber(0))
                .withMessageMatching(RacingException.ROUND_NUMBER_ZERO_ERROR);

    }
}
