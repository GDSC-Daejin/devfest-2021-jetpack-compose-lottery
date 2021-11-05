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