package collectionslist.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        if (ballCount <= lotteryType) {
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }
        List<Integer> ballPool = createBallPool(ballCount);
        List<Integer> winning = ballPool.subList(0, lotteryType);
        Collections.sort(winning);
        return winning;
    }

    private List<Integer> createBallPool(int balls) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i < balls; i++) {
            result.add(i);
        }
        Collections.shuffle(result);
        return result;
    }
}
