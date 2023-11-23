package baseball;

import java.util.*;

public class Game {

    private Map<State, Integer> result;

    public Map<State, Integer> game(List<Integer> computer, List<Integer> user) {
        initGameResult();
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i).equals(computer.get(i))) {
                result.put(State.STRIKE, result.get(State.STRIKE) + 1);
                continue;
            }
            if (computer.contains(user.get(i))) {
                result.put(State.BALL, result.get(State.BALL) + 1);
            }
        }
        return result;
    }

    private void initGameResult() {
        result = new HashMap<>();
        Arrays.stream(State.values())
                .forEach(state -> result.put(state, 0));
    }

    public boolean gameContinue() {
        return result.get(State.STRIKE) != 3;
    }
}