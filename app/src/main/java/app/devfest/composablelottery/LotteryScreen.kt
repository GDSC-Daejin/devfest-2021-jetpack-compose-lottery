package app.devfest.composablelottery

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.devfest.composablelottery.ui.LotteryListUi
import app.devfest.composablelottery.ui.LotteryPickButton

@Composable
fun LotteryScreen() {
    /**
     * 로또 앱 화면 UI 를 구현할 Composable 함수입니다.
     * 아래와 같은 Composable 함수들을 포함하여 이 화면을 구성할 것입니다.
     *
     * [app.devfest.composablelottery.ui.LotteryListUi]
     * [app.devfest.composablelottery.ui.LotteryPickButton]
     * */

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        var totalLottoList by remember { mutableStateOf((1..45).toList()) }
        var pickedLottoList by remember { mutableStateOf(emptyList<Int>()) }

        LotteryListUi(lottoNumbers = pickedLottoList)

        Spacer(modifier = Modifier.height(20.dp))

        LotteryPickButton(
            totalLottoList = totalLottoList,
            pickedLottoList = pickedLottoList,
            onLottoNumberPicked = {
                totalLottoList = totalLottoList - it
                pickedLottoList = pickedLottoList + it
            },
            onResetLottoList = {
                totalLottoList = (1..45).toList()
                pickedLottoList = emptyList()
            }
        )

    }


}