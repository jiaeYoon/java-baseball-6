package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    final List<Integer> nums;

    public Computer() {
        List<Integer> nums = new ArrayList<>();
        while (nums.size() < 3) {
            int num = Randoms.pickNumberInRange(1, 9);
            if (!nums.contains(num)) {
                nums.add(num);
            }
        }
        this.nums = nums;
    }
}
