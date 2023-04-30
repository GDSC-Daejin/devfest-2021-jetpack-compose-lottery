package app.devfest.composablelottery.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(20.dp)
            .background(Color.Yellow.copy(alpha = 0.3f)),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        if (lottoNumbers.isEmpty()) {
            Text(text = "아래 버튼을 눌러 로또 번호를 뽑아주세요!",
                color = Color.Black,
                fontWeight = FontWeight.ExtraBold)
        } else {
            lottoNumbers.forEach {
                LotteryItemUi(lottoNumber = it)
                Spacer(modifier = Modifier.size(5.dp))
            }
        }

    }

}

@Composable
@Preview
fun LotteryListUiPreview() {
    AppTheme {
        LotteryListUi(lottoNumbers = (1..45).shuffled().subList(0, 5))
    }
}