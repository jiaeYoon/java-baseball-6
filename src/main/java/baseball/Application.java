package baseball;

import java.util.List;
import java.util.Map;

public class Application {

    static int STOP = 2;
    static InputView inputView = new InputView();
    static OutputView outputView = new OutputView();
    static Game game = new Game();

    public static void main(String[] args) {

        outputView.printGameStart();
        do {
            Computer computer = new Computer();
            userTurn(computer);
            outputView.printNewGameStartOrNot();
        } while (inputView.readNewGameSignal() != STOP);

    }

    private static void userTurn(Computer computer) {
        do {
            List<Integer> userNums = inputView.readUserNums();
            User user = new User(userNums);

            Map<State, Integer> result = game.game(computer.nums, user.nums);
            outputView.printGameResult(result);
        } while (game.gameContinue());
    }
}
