package baseball.config;

public enum GameConfig {

    NUMBER_LENGTH(3),
    RANDOM_NUMBER_MINIMUM(1),
    RANDOM_NUMBER_MAXIMUM(9),

    RESTART_FLAG(1),
    EXIT_FLAG(2);

    private final int value;

    GameConfig(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
