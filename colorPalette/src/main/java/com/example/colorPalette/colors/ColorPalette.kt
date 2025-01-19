package com.example.colorPalette.colors

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

// Greens
private val green_50 = Color(0xFFE9EDC9)  // Lightest green
private val green_100 = Color(0xFFDDE4B8) // Very light green
private val green_200 = Color(0xFFD1DBA7) // Soft green
private val green_300 = Color(0xFFC5D296) // Light medium green
private val green_400 = Color(0xFFB9C985) // Medium green
private val green_500 = Color(0xFFADC074) // Rich green
private val green_600 = Color(0xFFA1B763) // Dark green
private val green_700 = Color(0xFF95AE52) // Darker green
private val green_800 = Color(0xFF89A541) // Deep green
private val green_900 = Color(0xFF7D9C30) // Deepest green

// Browns
private val brown_50 = Color(0xFFFEFAE0)  // Lightest brown
private val brown_100 = Color(0xFFFDF5D1) // Very light brown
private val brown_200 = Color(0xFFFCF0C2) // Soft beige
private val brown_300 = Color(0xFFFBEAB3) // Light medium brown
private val brown_400 = Color(0xFFF9E5A4) // Medium brown
private val brown_500 = Color(0xFFF8E095) // Rich brown
private val brown_600 = Color(0xFFF7DB86) // Dark brown
private val brown_700 = Color(0xFFF6D677) // Darker brown
private val brown_800 = Color(0xFFF5D168) // Deep brown
private val brown_900 = Color(0xFFD4A373) // Deepest brown (reference)

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

// Warning Colors
private val warning_50 = Color(0xFFFBE9E7)  // Lightest warning
private val warning_100 = Color(0xFFFFCCBC) // Very light warning
private val warning_200 = Color(0xFFFFAB91) // Soft warning
private val warning_300 = Color(0xFFFF8A65) // Light medium warning
private val warning_400 = Color(0xFFFF7043) // Medium warning
private val warning_500 = Color(0xFFFF5722) // Rich warning
private val warning_600 = Color(0xFFF4511E) // Dark warning
private val warning_700 = Color(0xFFE64A19) // Darker warning
private val warning_800 = Color(0xFFD84315) // Deep warning
private val warning_900 = Color(0xFF9C3806) // Deepest warning (reference)

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

    val warning50: Color = warning_50,
    val warning100: Color = warning_100,
    val warning200: Color = warning_200,
    val warning300: Color = warning_300,
    val warning400: Color = warning_400,
    val warning500: Color = warning_500,
    val warning600: Color = warning_600,
    val warning700: Color = warning_700,
    val warning800: Color = warning_800,
    val warning900: Color = warning_900,

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