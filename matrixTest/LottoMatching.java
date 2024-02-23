package matrixTest;

import java.util.Random;
import java.util.Scanner;

/**
 * 로또 발급은 1~8까지 중복없는 숫자 6개이다. 하나는 구매한 로또이다.
 * 추가된 로직은 추첨된 로또
 * 두 로또의 일치 여부에 다라 다음과 같은 메시지를 출력한다.
 * 단, 구매로또 번호와 추첨로또 번호 모두 같이 출력한다
 * <p>
 * 1등 = 6개 맞춤
 * 2등 = 5개
 * 3등 = 4개
 * 4등 = 3개
 * 꽝 = 2개 이하
 */

public class LottoMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("로또를 몇장 구매하시겠습니까?");
        String num = sc.next(); // 로또 몇장 살건지

//        String yourLotto = Lotto.main();
//        System.out.println(yourLotto);

    }
}
