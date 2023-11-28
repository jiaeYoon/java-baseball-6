package baseball;

import baseball.config.GameConfig;

public class Result {

    private final int ballCount;
    private final int strikeCount;

    public Result(Number computerNumbers, Number playerNumbers) {
        this.ballCount = computerNumbers.countBall(playerNumbers);
        this.strikeCount = computerNumbers.countStrike(playerNumbers);
    }


    public static Result create(Number computerNumbers, Number playerNumbers) {
        return new Result(computerNumbers, playerNumbers);
    }

    public int getBallCount() {
        return ballCount;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public boolean isAllStrike() {
        return this.strikeCount == GameConfig.NUMBER_LENGTH.getValue();
    }
}
