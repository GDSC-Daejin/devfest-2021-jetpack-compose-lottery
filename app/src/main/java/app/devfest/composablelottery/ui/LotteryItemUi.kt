package app.devfest.composablelottery.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import app.devfest.composablelottery.AppTheme

@Composable
fun LotteryItemUi(lottoNumber: Int) {
    /**
    * 이곳은 로또 공 UI 를 구현할 Composable 함수입니다.
    * 매개변수로 Int 자료형의 Lotto Number 를 받습니다.
    * number 의 범위에 따라 다른 색상을 표시합니다.
    * */

    val ballColor = when (lottoNumber) {
        in 1 .. 10 -> Color(0xFFE9B823)
        in 11 .. 20 -> Color(0xFF237CE9)
        in 21 .. 30 -> Color(0xFFC93737)
        in 31 .. 40 -> Color(0xFF505050)
        in 31 .. 45 -> Color(0xFF46A22C)
        else -> Color(0x00000000)
    }

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