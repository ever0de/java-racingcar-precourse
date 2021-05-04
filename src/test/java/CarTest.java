import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.Car;

public class CarTest {

    @Test
    @DisplayName("자동차는 4이상일 경우 전진하고, 3이하의 값이면 멈춘다.")
    void isForward() {
        int four = 4;
        assert(Car.isForward(four));

        int three = 3;
        assert(!Car.isForward(three));
    }
}
