package com.example.colorPalette.colors

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

// Browns
private val brown_50 = Color(0xFFF5F2E7)  // Light cream
private val brown_100 = Color(0xFFEDE7E0) // Very light brown
private val brown_200 = Color(0xFFD7CCC8) // Soft beige
private val brown_300 = Color(0xFFBCAAA4) // Light medium brown
private val brown_400 = Color(0xFFA1887F) // Medium brown
private val brown_500 = Color(0xFF8D6E63) // Rich brown
private val brown_600 = Color(0xFF795548) // Dark brown
private val brown_700 = Color(0xFF6D4C41) // Darker brown
private val brown_800 = Color(0xFF5D4037) // Deep brown
private val brown_900 = Color(0xFF4E342E) // Deepest brown

// Whites/Grays/Black
private val white = Color(0xFFFFFFFF)     // Pure white
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
private val black = Color(0xFF000000)     // Pure black

data class ColorPaletteProvider(
    val primary50: Color = Color(0xFFF5F2E7),
    val primary100: Color = Color(0xFFEDE7E0),
    val primary200: Color = Color(0xFFD7CCC8),
    val primary300: Color = Color(0xFFBCAAA4),
    val primary400: Color = Color(0xFFA1887F),
    val primary500: Color = Color(0xFF8D6E63),
    val primary600: Color = Color(0xFF795548),
    val primary700: Color = Color(0xFF6D4C41),
    val primary800: Color = Color(0xFF5D4037),
    val primary900: Color = Color(0xFF4E342E),

    val accent50: Color = Color(0xFFEAF4E1),
    val accent100: Color = Color(0xFFDCEFD4),
    val accent200: Color = Color(0xFFC5E1A5),
    val accent300: Color = Color(0xFFAED581),
    val accent400: Color = Color(0xFF9CCC65),
    val accent500: Color = Color(0xFF81C784),
    val accent600: Color = Color(0xFF66BB6A),
    val accent700: Color = Color(0xFF4CAF50),
    val accent800: Color = Color(0xFF43A047),
    val accent900: Color = Color(0xFF2E7D32),

    val white: Color = Color(0xFFFFFFFF),
    val gray50: Color = Color(0xFFFAFAFA),
    val gray100: Color = Color(0xFFF5F5F5),
    val gray200: Color = Color(0xFFEEEEEE),
    val gray300: Color = Color(0xFFE0E0E0),
    val gray400: Color = Color(0xFFBDBDBD),
    val gray500: Color = Color(0xFF9E9E9E),
    val gray600: Color = Color(0xFF757575),
    val gray700: Color = Color(0xFF616161),
    val gray800: Color = Color(0xFF424242),
    val gray900: Color = Color(0xFF212121),
    val black: Color = Color(0xFF000000)
)