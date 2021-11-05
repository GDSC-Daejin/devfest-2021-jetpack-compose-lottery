package app.devfest.composablelottery.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import app.devfest.composablelottery.AppTheme

@Composable
fun LotteryListUi(lottoNumbers: List<Int>) {

    /**
     * 이 곳은 lottoNumbers 만큼 [app.devfest.composablelottery.ui.LotteryItemUi] 를 표시해줄 부분입니다.
     * lottoNumbers 가 비어있지 않을 때는 "아래 버튼을 눌러 로또 번호를 뽑아주세요!" Text 를 표시합니다.
     *
     * <-- 힌트! -->
     * lottoNumbers 에 forEach 문으로 LotteryItemUi 를 선언하면 됩니다.
     * 다만 가로로 표시 되어야하므로 Row 안에서 구현을 해야합니다.
     * */

}

@Composable
@Preview
fun LotteryListUiPreview() {
    AppTheme {
        LotteryListUi(lottoNumbers = (1..45).shuffled().subList(0, 5))
    }
}