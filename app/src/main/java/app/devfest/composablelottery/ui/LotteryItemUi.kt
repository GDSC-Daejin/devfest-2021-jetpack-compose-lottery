package app.devfest.composablelottery.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import app.devfest.composablelottery.AppTheme

@Composable
fun LotteryItemUi(lottoNumber: Int) {
    /**
    * 이곳은 로또 공 UI 를 구현할 Composable 함수입니다.
    * 매개변수로 Int 자료형의 Lotto Number 를 받습니다.
    * number 의 범위에 따라 다른 색상을 표시합니다.
    * */

}

@Composable
@Preview
fun LotteryItemUiPreview() {
    AppTheme {
        Row {
            LotteryItemUi(10)
            LotteryItemUi(20)
            LotteryItemUi(30)
            LotteryItemUi(40)
            LotteryItemUi(45)
        }
    }
}