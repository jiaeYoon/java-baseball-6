package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class InputView extends InputValidate {

    public List<Integer> readUserNums() {
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        return numsValidate(input);
    }

    public int readNewGameSignal() {
        return Integer.parseInt(Console.readLine());
    }
}