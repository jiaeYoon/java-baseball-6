package baseball;

import java.util.Map;

public class OutputView {

    public void printGameStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void printGameResult(Map<State, Integer> result) {
        int ball = result.get(State.BALL);
        int strike = result.get(State.STRIKE);

        String output = "";
        if (ball != 0) {
            output += ball + "볼 ";
        }
        if (strike != 0) {
            output += strike + "스트라이크";
        }
        if (ball == 0 && strike == 0) {
            output = "낫싱";
        }
        System.out.println(output);
    }
}
