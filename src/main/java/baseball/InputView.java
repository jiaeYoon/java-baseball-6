package baseball;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String readPlayerInput() {
        System.out.print("숫자를 입력해주세요 : ");
        return Console.readLine();
    }

    public static int readRestartSignal() {
        return Integer.parseInt(Console.readLine());
    }
}