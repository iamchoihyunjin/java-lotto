package lotto.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoNumbersTicketBoxTest {

    @DisplayName("로또 개수가 잘 나오는 지 확인한다.")
    @ParameterizedTest
    @ValueSource(ints = {20000, 40000, 50000, 1000, 1001})
    void buy(int value) {
        assertThat(LottoTicketBox.buy(value).getLotteries().size()).isEqualTo(value / 1000);
    }
}
