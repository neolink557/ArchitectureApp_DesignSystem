package com.example.spacingresources.spacing

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.dp
import java.nio.file.WatchEvent.Modifier

object SpacingProvider {
    // Very small increments
    val none = 0.dp
    val tiny = 2.dp
    val extraSmall = 4.dp
    val small = 6.dp
    val smallMedium = 8.dp
    val smallLarge = 10.dp

    // More small increments
    val smallExtraLarge = 12.dp
    val smallXXLarge = 14.dp

    // Medium increments
    val mediumSmall = 16.dp
    val medium = 18.dp
    val mediumRegular = 20.dp
    val mediumLarge = 22.dp
    val mediumExtraLarge = 24.dp
    val mediumXXLarge = 26.dp
    val mediumXXXLarge = 28.dp
    val mediumHuge = 30.dp

    // Large increments
    val large = 32.dp
    val extraLarge = 40.dp
    val xxLarge = 48.dp
    val xxxLarge = 56.dp

    // Very large increments
    val huge = 64.dp
    val massive = 72.dp
    val gigantic = 80.dp
    val colossal = 96.dp
    val enormous = 112.dp
    val monumental = 128.dp
    val titanic = 144.dp
}

val LocalSpacingProvider = staticCompositionLocalOf<SpacingProvider> {
    error("No Spacing provided")
}

val LocalModifierProvider = staticCompositionLocalOf<Modifier> {
    error("No modifier provided")
}