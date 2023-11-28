package baseball;

import baseball.config.GameConfig;

import java.util.List;
import java.util.Set;

public class InputValidate {

    public static List<Integer> numsValidate(String input) {
        List<Integer> nums = isNumInRange(input);
        hasDuplicate(nums);
        is3Digit(nums);
        return nums;
    }

    private static void is3Digit(List<Integer> nums) {
        if (nums.size() != GameConfig.NUMBER_LENGTH.getValue()) {
            throw new IllegalArgumentException();
        }
    }

    private static void hasDuplicate(List<Integer> nums) {
        if (Set.copyOf(nums).size() != nums.size()) {
            throw new IllegalArgumentException();
        }
    }

    private static List<Integer> isNumInRange(String input) {
        String regex = "^([1-9]+)$";
        if (!input.matches(regex)) {
            throw new IllegalArgumentException();
        }
        return Util.toIntegerList(input);
    }
}