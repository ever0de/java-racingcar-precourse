import exception.RacingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.CarNameList;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class CarNameListTest {

    final List<String> stringList = new ArrayList<>();

    @BeforeEach
    void init() {
        stringList.add("hi");
        stringList.add("hi");
    }

    @Test
    @DisplayName("자동차 경주에서 중복된 이름이 나온다면 CarNameListDuplicateException을 내뱉는다.")
    void duplicateList() {
        CarNameList nameList = new CarNameList();
        nameList.add(stringList.get(0));
        assertThatExceptionOfType(RacingException.CarNameListDuplicateException.class)
                .isThrownBy(() -> nameList.add(stringList.get(1)))
                .withMessageMatching(RacingException.DUPLICATE_STRING_ERROR);
    }
}
