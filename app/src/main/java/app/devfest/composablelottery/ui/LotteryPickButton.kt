package app.devfest.composablelottery.ui

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun LotteryPickButton(
    totalLottoList: List<Int>,
    pickedLottoList: List<Int>,
    onLottoNumberPicked: (Int) -> Unit,
    onResetLottoList: () -> Unit
) {

    if (pickedLottoList.size == 6) {
        Button(onClick = onResetLottoList) {
            Text(text = "다시 뽑기")
        }
    } else {
        Button(onClick = {
            onLottoNumberPicked(totalLottoList.random())
        }) {
            Text(text = "뽑기")
        }
    }

}