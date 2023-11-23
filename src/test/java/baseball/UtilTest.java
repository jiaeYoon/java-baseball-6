package baseball;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class UtilTest extends Util {

    @Test
    void 문자열을_숫자리스트로_변환() {

        //given
        String input = "124";

        //when
        List<Integer> result = toIntegerList(input);

        //then
        assertThat(result).contains(1, 2, 4);
    }
}