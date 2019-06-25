package lotto.util;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoTicketBoxTest {

    @ParameterizedTest
    @ValueSource(ints = {20000, 40000, 50000})
    void buy(int value) {
        assertThat(LottoTicketBox.buy(value).size()).isEqualTo(value / 1000);
    }
}
