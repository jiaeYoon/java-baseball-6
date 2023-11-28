package baseball;

public class OutputView {

    public static void printGameStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printGameResult(Result result) {
        int ballCount = result.getBallCount();
        int strikeCount = result.getStrikeCount();

        String output = "";
        if (ballCount != 0) {
            output += ballCount + "볼 ";
        }
        if (strikeCount != 0) {
            output += strikeCount + "스트라이크";
        }
        if (ballCount == 0 && strikeCount == 0) {
            output = "낫싱";
        }
        System.out.println(output);
    }

    public static void printNewGameStartOrNot() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n"
                                   + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
