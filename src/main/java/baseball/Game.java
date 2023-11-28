package baseball;

import baseball.config.GameConfig;

public class Game {

    public void start() {
        OutputView.printGameStart();
        do {
            Number computerNumber = Number.makeRandomNumbers();
            play(computerNumber);
            OutputView.printNewGameStartOrNot();
        } while (restart());
    }

    private void play(Number computerNumber) {
        Result result;
        do {
            String input = InputView.readPlayerInput();
            Number playerNumber = Number.makeInputToNumber(input);
            result = Result.create(computerNumber, playerNumber);
            OutputView.printGameResult(result);
        } while (gameContinue(result));
    }

    private boolean restart() {
        return InputView.readRestartSignal() == GameConfig.RESTART_FLAG.getValue();
    }

    public boolean gameContinue(Result result) {
        return !result.isAllStrike();
    }
}