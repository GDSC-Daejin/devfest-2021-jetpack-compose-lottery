package app.devfest.composablelottery

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val lightColors = lightColors(
    primary = Color(0xFF4CAF50),
    primaryVariant = Color(0xFF43A047),
    secondary = Color(0xFFFFB300),
    secondaryVariant = Color(0xFFFFA000),
    background = Color.White,
    surface = Color.White,
    error = Color(0xFFB00020),
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    onError = Color.White
)

private val darkColors = darkColors(
    primary = Color(0xFF81C784),
    primaryVariant = Color(0xFF43A047),
    secondary = Color(0xFFFFB300),
    secondaryVariant = Color(0xFFFFA000),
    background = Color(0xFF121212),
    surface = Color(0xFF121212),
    error = Color(0xFFCF6679),
    onPrimary = Color.Black,
    onSecondary = Color.Black,
    onBackground = Color.White,
    onSurface = Color.White,
    onError = Color.Black
)

@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {
    val isSystemDarkTheme = isSystemInDarkTheme()
    MaterialTheme(
        colors = if (isSystemDarkTheme) darkColors else lightColors,
        content = content
    )
}