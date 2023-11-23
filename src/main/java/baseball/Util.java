package baseball;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static List<Integer> toIntegerList(String input) {
        List<Integer> nums = new ArrayList<>();
        for (String s : input.split("")) {
            nums.add(Integer.parseInt(s));
        }
        return nums;
    }
}
