package lotto.util;

import lotto.domain.Lotto;

import java.util.HashMap;
import java.util.List;

import static lotto.CommonMessages.*;
import static lotto.LottoGameController.LottoGameController.*;
import static lotto.MATCHING.*;

public class Output {


    public void printPurchaseAmount(Integer amount) {

        System.out.println();
        System.out.println(amount + "개를 구매했습니다.");
    }

    public void printLottoNumbers(List<Lotto> lottos) {

        for (Lotto lotto : lottos) {

            String numbers = lotto.getNumbers().toString();
            System.out.println(String.join(", ", numbers));
        }
    }

    public void printResult(Integer purchaseAmount, HashMap<Integer, Integer> result, double profit) {

        System.out.println();
        System.out.println(WINNING_RESULT.getMessage());
        System.out.println(MATCH_THREE.getMessage(result.get(ANSWER_COUNT_THREE)));
        System.out.println(MATCH_FOUR.getMessage(result.get(ANSWER_COUNT_FOUR)));
        System.out.println(MATCH_FIVE.getMessage(result.get(ANSWER_COUNT_FIVE)));
        System.out.println(MATCH_FIVE_BONUS.getMessage(result.get(ANSWER_COUNT_FIVE_BONUS)));
        System.out.println(MATCH_SIX.getMessage(result.get(ANSWER_COUNT_SIX)));
        System.out.println(PROFIT_RATE.getMessage(profit));
    }
}
