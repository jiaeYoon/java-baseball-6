package baseball;

import baseball.config.GameConfig;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Number {

    private final List<Integer> numbers;

    public Number(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static Number makeRandomNumbers() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < GameConfig.NUMBER_LENGTH.getValue()) {
            int num = Randoms.pickNumberInRange(GameConfig.RANDOM_NUMBER_MINIMUM.getValue(), GameConfig.RANDOM_NUMBER_MAXIMUM.getValue());
            if (!numbers.contains(num)) {
                numbers.add(num);
            }
        }
        return new Number(numbers);
    }

    public static Number makeInputToNumber(String input) {
        InputValidate.numsValidate(input);
        return new Number(Util.toIntegerList(input));
    }

    public int countBall(Number playerNumbers) {
        int ballCount = 0;
        List<Integer> computerNumbers = this.numbers;
        for (int i = 0; i < GameConfig.NUMBER_LENGTH.getValue(); i++) {
            int computerNumber = computerNumbers.get(i);
            int playerNumber = playerNumbers.numbers.get(i);
            if (playerNumber != computerNumber && computerNumbers.contains(playerNumber)) {
                ballCount++;
            }
        }
        return ballCount;
    }

    public int countStrike(Number playerNumbers) {
        int strikeCount = 0;
        for (int i = 0; i < GameConfig.NUMBER_LENGTH.getValue(); i++) {
            int computerNumber = this.numbers.get(i);
            int playerNumber = playerNumbers.numbers.get(i);
            if (playerNumber == computerNumber) {
                strikeCount++;
            }
        }
        return strikeCount;
    }
}
