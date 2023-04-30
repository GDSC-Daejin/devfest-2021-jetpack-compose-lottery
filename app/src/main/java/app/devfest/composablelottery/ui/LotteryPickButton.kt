package app.devfest.composablelottery.ui

import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

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
     *
     * 뽑기 버튼을 눌렀을때는 [onLottoNumberPicked] 에 totalLottoList 에서 랜덤으로 뽑힌 숫자와 함께 invoke,
     * 다시 뽑기 버튼을 눌렀을때는 [onResetLottoList] 를 invoke 합니다.
     * */
    if (pickedLottoList.size == 6) {
        // 다시 뽑기 버튼 구현
        Button(
            onClick = { onResetLottoList() },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red.copy(0.8f),
            contentColor = Color.White)
        ) {
            Text(text = "다시 뽑기")
        }
    } else {
        // 뽑기 버튼 구현
        Button(
            onClick = {
                onLottoNumberPicked((totalLottoList - pickedLottoList.toSet()).shuffled().first())
            },
        ) {
            Text(text = "뽑기")
        }
    }

}