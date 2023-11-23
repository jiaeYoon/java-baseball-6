package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

public class InputValidateTest extends InputValidate {

    @ParameterizedTest
    @MethodSource("numsValidateData")
    void 사용자_입력_검증_통과(String input, List<Integer> expected) {
        List<Integer> result = numsValidate(input);
        assertThat(result).isEqualTo(expected);
    }

    static Stream<Arguments> numsValidateData() {
        return Stream.of(
                Arguments.of("123", Arrays.asList(1, 2, 3)),
                Arguments.of("917", Arrays.asList(9, 1, 7))
        );
    }

    @ParameterizedTest
    @ValueSource(strings = {"012", "119"})
    void 사용자_입력_검증_예외처리(String input) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> numsValidate(input));
    }
}
