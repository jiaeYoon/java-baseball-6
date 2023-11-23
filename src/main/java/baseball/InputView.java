package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class InputView extends InputValidate {

    public void readUserNums() {
        while (true) {
            try {
                String input = Console.readLine();
                List<Integer> nums = numsValidate(input);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERROR] 유효하지 않은 수입니다. 다시 입력해주세요.");
            }
        }
    }
}
