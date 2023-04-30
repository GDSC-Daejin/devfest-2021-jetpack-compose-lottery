package app.devfest.composablelottery

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
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
     *
     * <-- 힌트! -->
     * XML 에는 LinearLayout, FrameLayout 등이 있다면
     * Compose 에는 Column (LinearLayout+Vertical), Row (LinearLayout+Horizontal), Box (FrameLayout)
     * 가 있습니다.
     * */

    val totalLottoList by remember { mutableStateOf((1..45).toList()) }
    var pickedLottoList by remember { mutableStateOf(emptyList<Int>()) }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray.copy(0.5f)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "뽑힌 로또 아이템", color = Color.Black, fontWeight = FontWeight.ExtraBold)
        LotteryListUi(lottoNumbers = pickedLottoList)
        LotteryPickButton(
            totalLottoList = totalLottoList,
            pickedLottoList = pickedLottoList,
            onLottoNumberPicked = { pickedNumber ->
                pickedLottoList = pickedLottoList + pickedNumber
            },
            onResetLottoList = {
                pickedLottoList = emptyList()
            })
    }
}

