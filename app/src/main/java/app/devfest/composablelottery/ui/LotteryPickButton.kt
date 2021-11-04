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

    /**
     * 로또 번호를 뽑는 버튼을 만듭니다.
     * 뽑힌 공 갯수가 6개라면 "다시 뽑기" 버튼, 아니라면 "뽑기" 버튼을 표시합니다.
     * */
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