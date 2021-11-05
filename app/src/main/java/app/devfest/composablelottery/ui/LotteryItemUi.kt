package app.devfest.composablelottery.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.devfest.composablelottery.AppTheme

@Composable
fun LotteryItemUi(lottoNumber: Int) {

    val ballColor = when (lottoNumber) {
        in 1 .. 10 -> Color(0xFFE9B823)
        in 11 .. 20 -> Color(0xFF237CE9)
        in 21 .. 30 -> Color(0xFFC93737)
        in 31 .. 40 -> Color(0xFF505050)
        in 31 .. 45 -> Color(0xFF46A22C)
        else -> Color(0x00000000)
    }

    Box(
        modifier = Modifier
            .size(30.dp)
            .background(ballColor, CircleShape)
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = lottoNumber.toString(),
            color = Color.White
        )
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