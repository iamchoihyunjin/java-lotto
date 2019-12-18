package lotto.domain;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoMachineTest {

    @Test
    @RepeatedTest(20)
    void 로또_번호가_잘_나오는지_테스트한다() {
        assertThat(new LottoMachine().generate())
                .hasSize(6)
                .allMatch(number -> number >= 1 && number <= 45);
    }
}
