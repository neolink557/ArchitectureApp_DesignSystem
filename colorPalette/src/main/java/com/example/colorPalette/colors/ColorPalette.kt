package com.example.colorPalette.colors

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

// Greens
private val green_50 = Color(0xFFEAF4E1)  // Light green
private val green_100 = Color(0xFFDCEFD4) // Very light green
private val green_200 = Color(0xFFC5E1A5) // Soft green
private val green_300 = Color(0xFFAED581) // Light medium green
private val green_400 = Color(0xFF9CCC65) // Medium green
private val green_500 = Color(0xFF81C784) // Medium green
private val green_600 = Color(0xFF66BB6A) // Rich green
private val green_700 = Color(0xFF4CAF50) // Dark green
private val green_800 = Color(0xFF43A047) // Darker green
private val green_900 = Color(0xFF2E7D32) // Deep green

private val brown_50 = Color(0xFFFBE9E7)  // Light peach
private val brown_100 = Color(0xFFFFCCBC) // Very light warm brown
private val brown_200 = Color(0xFFFFAB91) // Soft warm beige
private val brown_300 = Color(0xFFFF8A65) // Light medium warm brown
private val brown_400 = Color(0xFFFF7043) // Medium warm brown
private val brown_500 = Color(0xFFFF5722) // Rich warm brown
private val brown_600 = Color(0xFFF4511E) // Dark warm brown
private val brown_700 = Color(0xFFE64A19) // Darker warm brown
private val brown_800 = Color(0xFFD84315) // Deep warm brown
private val brown_900 = Color(0xFFBF360C) // Deepest warm brown

// Whites/Grays/Black
private val total_white = Color(0xFFFFFFFF)     // Pure white
private val gray_50 = Color(0xFFFAFAFA)   // Very light gray
private val gray_100 = Color(0xFFF5F5F5)  // Light gray
private val gray_200 = Color(0xFFEEEEEE)  // Light gray
private val gray_300 = Color(0xFFE0E0E0)  // Medium light gray
private val gray_400 = Color(0xFFBDBDBD)  // Medium gray
private val gray_500 = Color(0xFF9E9E9E)  // Medium gray
private val gray_600 = Color(0xFF757575)  // Dark gray
private val gray_700 = Color(0xFF616161)  // Dark gray
private val gray_800 = Color(0xFF424242)  // Darker gray
private val gray_900 = Color(0xFF212121)  // Deep gray
private val total_black = Color(0xFF000000)     // Pure black

data class ColorPaletteProvider(
    val primary50: Color = brown_50,
    val primary100: Color = brown_100,
    val primary200: Color = brown_200,
    val primary300: Color = brown_300,
    val primary400: Color = brown_400,
    val primary500: Color = brown_500,
    val primary600: Color = brown_600,
    val primary700: Color = brown_700,
    val primary800: Color = brown_800,
    val primary900: Color = brown_900,

    val accent50: Color = green_50,
    val accent100: Color = green_100,
    val accent200: Color = green_200,
    val accent300: Color = green_300,
    val accent400: Color = green_400,
    val accent500: Color = green_500,
    val accent600: Color = green_600,
    val accent700: Color = green_700,
    val accent800: Color = green_800,
    val accent900: Color = green_900,

    val white: Color = total_white,
    val gray50: Color = gray_50,
    val gray100: Color = gray_100,
    val gray200: Color = gray_200,
    val gray300: Color = gray_300,
    val gray400: Color = gray_400,
    val gray500: Color = gray_500,
    val gray600: Color = gray_600,
    val gray700: Color = gray_700,
    val gray800: Color = gray_800,
    val gray900: Color = gray_900,
    val black: Color = total_black
)

val LocalColorProvider = staticCompositionLocalOf<ColorPaletteProvider> {
    error("No Color provided")
}