package io.github.rldona.openpassword.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Palette taken from the app logo: sky blue accent (#52BADE) on deep navy (#10203C).
private val Light = lightColorScheme(
    primary = Color(0xFF1F6F94),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFD7EEF8),
    onPrimaryContainer = Color(0xFF0B3A52),
    secondary = Color(0xFF5A6573),
    secondaryContainer = Color(0xFFE2E8EF),
    onSecondaryContainer = Color(0xFF141E2B),
    tertiary = Color(0xFFA15C00),
    tertiaryContainer = Color(0xFFDDEBF6),
    onTertiaryContainer = Color(0xFF0B3A52),
    background = Color(0xFFF6F8FB),
    onBackground = Color(0xFF141E2B),
    surface = Color(0xFFF6F8FB),
    onSurface = Color(0xFF141E2B),
    surfaceVariant = Color(0xFFE2E8EF),
    onSurfaceVariant = Color(0xFF5A6573),
    surfaceContainerLowest = Color(0xFFFFFFFF),
    surfaceContainerLow = Color(0xFFFFFFFF),
    surfaceContainer = Color(0xFFEEF2F7),
    surfaceContainerHigh = Color(0xFFE8EDF3),
    outline = Color(0xFFB5C0CC),
    outlineVariant = Color(0xFFD3DAE3),
    error = Color(0xFFB3261E),
    errorContainer = Color(0xFFF9DEDC),
)

private val Dark = darkColorScheme(
    primary = Color(0xFF52BADE),
    onPrimary = Color(0xFF002F43),
    primaryContainer = Color(0xFF163A55),
    onPrimaryContainer = Color(0xFFC4E8F7),
    secondary = Color(0xFF97A6B8),
    secondaryContainer = Color(0xFF22324D),
    onSecondaryContainer = Color(0xFFE2EAF4),
    tertiary = Color(0xFFE6A64B),
    tertiaryContainer = Color(0xFF22385A),
    onTertiaryContainer = Color(0xFFE2EAF4),
    background = Color(0xFF10203C),
    onBackground = Color(0xFFE2EAF4),
    surface = Color(0xFF10203C),
    onSurface = Color(0xFFE2EAF4),
    surfaceVariant = Color(0xFF22324D),
    onSurfaceVariant = Color(0xFF97A6B8),
    surfaceContainerLowest = Color(0xFF0B172C),
    surfaceContainerLow = Color(0xFF152745),
    surfaceContainer = Color(0xFF192C4B),
    surfaceContainerHigh = Color(0xFF1F3354),
    outline = Color(0xFF46597A),
    outlineVariant = Color(0xFF263A5A),
    error = Color(0xFFF2867E),
    errorContainer = Color(0xFF3D1A18),
)

val SecretFont: FontFamily = FontFamily.Monospace

private fun typography(): Typography {
    val base = Typography()
    return base.copy(
        headlineMedium = base.headlineMedium.copy(fontWeight = FontWeight.Bold, letterSpacing = (-0.3).sp),
        titleLarge = base.titleLarge.copy(fontWeight = FontWeight.Bold),
        labelSmall = base.labelSmall.copy(letterSpacing = 0.8.sp),
    )
}

val SecretText = TextStyle(fontFamily = SecretFont, fontSize = 16.sp, letterSpacing = 0.5.sp)

@Composable
fun OpenPasswordTheme(content: @Composable () -> Unit) {
    val colors: ColorScheme = if (isSystemInDarkTheme()) Dark else Light
    MaterialTheme(colorScheme = colors, typography = typography(), content = content)
}
