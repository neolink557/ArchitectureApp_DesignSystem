package com.example.fontresources.fonts

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

class FontResourcesProvider(
    // Title Large Variations
    val titleLargeBold: TextStyle = createTextStyle(FontWeight.Bold, FontSizes.TITLE_LARGE_FONT_SIZE, FontSizes.TITLE_LARGE_LINE_HEIGHT),
    val titleLargeExtraBold: TextStyle = createTextStyle(FontWeight.ExtraBold, FontSizes.TITLE_LARGE_FONT_SIZE, FontSizes.TITLE_LARGE_LINE_HEIGHT),
    val titleLargeExtraLightItalic: TextStyle = createTextStyle(FontWeight.ExtraLight, FontSizes.TITLE_LARGE_FONT_SIZE, FontSizes.TITLE_LARGE_LINE_HEIGHT, FontStyle.Italic),
    val titleLargeExtraLight: TextStyle = createTextStyle(FontWeight.ExtraLight, FontSizes.TITLE_LARGE_FONT_SIZE, FontSizes.TITLE_LARGE_LINE_HEIGHT),
    val titleLargeItalic: TextStyle = createTextStyle(FontWeight.Normal, FontSizes.TITLE_LARGE_FONT_SIZE, FontSizes.TITLE_LARGE_LINE_HEIGHT, FontStyle.Italic),
    val titleLargeLightItalic: TextStyle = createTextStyle(FontWeight.Light, FontSizes.TITLE_LARGE_FONT_SIZE, FontSizes.TITLE_LARGE_LINE_HEIGHT, FontStyle.Italic),
    val titleLargeLight: TextStyle = createTextStyle(FontWeight.Light, FontSizes.TITLE_LARGE_FONT_SIZE, FontSizes.TITLE_LARGE_LINE_HEIGHT),
    val titleLargeMedium: TextStyle = createTextStyle(FontWeight.Medium, FontSizes.TITLE_LARGE_FONT_SIZE, FontSizes.TITLE_LARGE_LINE_HEIGHT),
    val titleLargeSemiBold: TextStyle = createTextStyle(FontWeight.SemiBold, FontSizes.TITLE_LARGE_FONT_SIZE, FontSizes.TITLE_LARGE_LINE_HEIGHT),
    val titleLargeThinItalic: TextStyle = createTextStyle(FontWeight.Thin, FontSizes.TITLE_LARGE_FONT_SIZE, FontSizes.TITLE_LARGE_LINE_HEIGHT, FontStyle.Italic),
    val titleLargeThin: TextStyle = createTextStyle(FontWeight.Thin, FontSizes.TITLE_LARGE_FONT_SIZE, FontSizes.TITLE_LARGE_LINE_HEIGHT),
    val titleLargeSans: TextStyle = createTextStyle(FontWeight.Normal, FontSizes.TITLE_LARGE_FONT_SIZE, FontSizes.TITLE_LARGE_LINE_HEIGHT),

    // Title Medium Variations
    val titleMediumBold: TextStyle = createTextStyle(FontWeight.Bold, FontSizes.TITLE_MEDIUM_FONT_SIZE, FontSizes.TITLE_MEDIUM_LINE_HEIGHT),
    val titleMediumExtraBold: TextStyle = createTextStyle(FontWeight.ExtraBold, FontSizes.TITLE_MEDIUM_FONT_SIZE, FontSizes.TITLE_MEDIUM_LINE_HEIGHT),
    val titleMediumExtraLightItalic: TextStyle = createTextStyle(FontWeight.ExtraLight, FontSizes.TITLE_MEDIUM_FONT_SIZE, FontSizes.TITLE_MEDIUM_LINE_HEIGHT, FontStyle.Italic),
    val titleMediumExtraLight: TextStyle = createTextStyle(FontWeight.ExtraLight, FontSizes.TITLE_MEDIUM_FONT_SIZE, FontSizes.TITLE_MEDIUM_LINE_HEIGHT),
    val titleMediumItalic: TextStyle = createTextStyle(FontWeight.Normal, FontSizes.TITLE_MEDIUM_FONT_SIZE, FontSizes.TITLE_MEDIUM_LINE_HEIGHT, FontStyle.Italic),
    val titleMediumLightItalic: TextStyle = createTextStyle(FontWeight.Light, FontSizes.TITLE_MEDIUM_FONT_SIZE, FontSizes.TITLE_MEDIUM_LINE_HEIGHT, FontStyle.Italic),
    val titleMediumLight: TextStyle = createTextStyle(FontWeight.Light, FontSizes.TITLE_MEDIUM_FONT_SIZE, FontSizes.TITLE_MEDIUM_LINE_HEIGHT),
    val titleMediumMedium: TextStyle = createTextStyle(FontWeight.Medium, FontSizes.TITLE_MEDIUM_FONT_SIZE, FontSizes.TITLE_MEDIUM_LINE_HEIGHT),
    val titleMediumSemiBold: TextStyle = createTextStyle(FontWeight.SemiBold, FontSizes.TITLE_MEDIUM_FONT_SIZE, FontSizes.TITLE_MEDIUM_LINE_HEIGHT),
    val titleMediumThinItalic: TextStyle = createTextStyle(FontWeight.Thin, FontSizes.TITLE_MEDIUM_FONT_SIZE, FontSizes.TITLE_MEDIUM_LINE_HEIGHT, FontStyle.Italic),
    val titleMediumThin: TextStyle = createTextStyle(FontWeight.Thin, FontSizes.TITLE_MEDIUM_FONT_SIZE, FontSizes.TITLE_MEDIUM_LINE_HEIGHT),
    val titleMediumSans: TextStyle = createTextStyle(FontWeight.Normal, FontSizes.TITLE_MEDIUM_FONT_SIZE, FontSizes.TITLE_MEDIUM_LINE_HEIGHT),

    // Title Small Variations
    val titleSmallBold: TextStyle = createTextStyle(FontWeight.Bold, FontSizes.TITLE_SMALL_FONT_SIZE, FontSizes.TITLE_SMALL_LINE_HEIGHT),
    val titleSmallExtraBold: TextStyle = createTextStyle(FontWeight.ExtraBold, FontSizes.TITLE_SMALL_FONT_SIZE, FontSizes.TITLE_SMALL_LINE_HEIGHT),
    val titleSmallExtraLightItalic: TextStyle = createTextStyle(FontWeight.ExtraLight, FontSizes.TITLE_SMALL_FONT_SIZE, FontSizes.TITLE_SMALL_LINE_HEIGHT, FontStyle.Italic),
    val titleSmallExtraLight: TextStyle = createTextStyle(FontWeight.ExtraLight, FontSizes.TITLE_SMALL_FONT_SIZE, FontSizes.TITLE_SMALL_LINE_HEIGHT),
    val titleSmallItalic: TextStyle = createTextStyle(FontWeight.Normal, FontSizes.TITLE_SMALL_FONT_SIZE, FontSizes.TITLE_SMALL_LINE_HEIGHT, FontStyle.Italic),
    val titleSmallLightItalic: TextStyle = createTextStyle(FontWeight.Light, FontSizes.TITLE_SMALL_FONT_SIZE, FontSizes.TITLE_SMALL_LINE_HEIGHT, FontStyle.Italic),
    val titleSmallLight: TextStyle = createTextStyle(FontWeight.Light, FontSizes.TITLE_SMALL_FONT_SIZE, FontSizes.TITLE_SMALL_LINE_HEIGHT),
    val titleSmallMedium: TextStyle = createTextStyle(FontWeight.Medium, FontSizes.TITLE_SMALL_FONT_SIZE, FontSizes.TITLE_SMALL_LINE_HEIGHT),
    val titleSmallSemiBold: TextStyle = createTextStyle(FontWeight.SemiBold, FontSizes.TITLE_SMALL_FONT_SIZE, FontSizes.TITLE_SMALL_LINE_HEIGHT),
    val titleSmallThinItalic: TextStyle = createTextStyle(FontWeight.Thin, FontSizes.TITLE_SMALL_FONT_SIZE, FontSizes.TITLE_SMALL_LINE_HEIGHT, FontStyle.Italic),
    val titleSmallThin: TextStyle = createTextStyle(FontWeight.Thin, FontSizes.TITLE_SMALL_FONT_SIZE, FontSizes.TITLE_SMALL_LINE_HEIGHT),
    val titleSmallSans: TextStyle = createTextStyle(FontWeight.Normal, FontSizes.TITLE_SMALL_FONT_SIZE, FontSizes.TITLE_SMALL_LINE_HEIGHT),

    // Subtitle Large Variations
    val subtitleLargeBold: TextStyle = createTextStyle(FontWeight.Bold, FontSizes.SUBTITLE_LARGE_FONT_SIZE, FontSizes.SUBTITLE_LARGE_LINE_HEIGHT),
    val subtitleLargeExtraBold: TextStyle = createTextStyle(FontWeight.ExtraBold, FontSizes.SUBTITLE_LARGE_FONT_SIZE, FontSizes.SUBTITLE_LARGE_LINE_HEIGHT),
    val subtitleLargeExtraLightItalic: TextStyle = createTextStyle(FontWeight.ExtraLight, FontSizes.SUBTITLE_LARGE_FONT_SIZE, FontSizes.SUBTITLE_LARGE_LINE_HEIGHT, FontStyle.Italic),
    val subtitleLargeExtraLight: TextStyle = createTextStyle(FontWeight.ExtraLight, FontSizes.SUBTITLE_LARGE_FONT_SIZE, FontSizes.SUBTITLE_LARGE_LINE_HEIGHT),
    val subtitleLargeItalic: TextStyle = createTextStyle(FontWeight.Normal, FontSizes.SUBTITLE_LARGE_FONT_SIZE, FontSizes.SUBTITLE_LARGE_LINE_HEIGHT, FontStyle.Italic),
    val subtitleLargeLightItalic: TextStyle = createTextStyle(FontWeight.Light, FontSizes.SUBTITLE_LARGE_FONT_SIZE, FontSizes.SUBTITLE_LARGE_LINE_HEIGHT, FontStyle.Italic),
    val subtitleLargeLight: TextStyle = createTextStyle(FontWeight.Light, FontSizes.SUBTITLE_LARGE_FONT_SIZE, FontSizes.SUBTITLE_LARGE_LINE_HEIGHT),
    val subtitleLargeMedium: TextStyle = createTextStyle(FontWeight.Medium, FontSizes.SUBTITLE_LARGE_FONT_SIZE, FontSizes.SUBTITLE_LARGE_LINE_HEIGHT),
    val subtitleLargeSemiBold: TextStyle = createTextStyle(FontWeight.SemiBold, FontSizes.SUBTITLE_LARGE_FONT_SIZE, FontSizes.SUBTITLE_LARGE_LINE_HEIGHT),
    val subtitleLargeThinItalic: TextStyle = createTextStyle(FontWeight.Thin, FontSizes.SUBTITLE_LARGE_FONT_SIZE, FontSizes.SUBTITLE_LARGE_LINE_HEIGHT, FontStyle.Italic),
    val subtitleLargeThin: TextStyle = createTextStyle(FontWeight.Thin, FontSizes.SUBTITLE_LARGE_FONT_SIZE, FontSizes.SUBTITLE_LARGE_LINE_HEIGHT),
    val subtitleLargeSans: TextStyle = createTextStyle(FontWeight.Normal, FontSizes.SUBTITLE_LARGE_FONT_SIZE, FontSizes.SUBTITLE_LARGE_LINE_HEIGHT),

    // Subtitle Medium Variations
    val subtitleMediumBold: TextStyle = createTextStyle(FontWeight.Bold, FontSizes.SUBTITLE_MEDIUM_FONT_SIZE, FontSizes.SUBTITLE_MEDIUM_LINE_HEIGHT),
    val subtitleMediumExtraBold: TextStyle = createTextStyle(FontWeight.ExtraBold, FontSizes.SUBTITLE_MEDIUM_FONT_SIZE, FontSizes.SUBTITLE_MEDIUM_LINE_HEIGHT),
    val subtitleMediumExtraLightItalic: TextStyle = createTextStyle(FontWeight.ExtraLight, FontSizes.SUBTITLE_MEDIUM_FONT_SIZE, FontSizes.SUBTITLE_MEDIUM_LINE_HEIGHT, FontStyle.Italic),
    val subtitleMediumExtraLight: TextStyle = createTextStyle(FontWeight.ExtraLight, FontSizes.SUBTITLE_MEDIUM_FONT_SIZE, FontSizes.SUBTITLE_MEDIUM_LINE_HEIGHT),
    val subtitleMediumItalic: TextStyle = createTextStyle(FontWeight.Normal, FontSizes.SUBTITLE_MEDIUM_FONT_SIZE, FontSizes.SUBTITLE_MEDIUM_LINE_HEIGHT, FontStyle.Italic),
    val subtitleMediumLightItalic: TextStyle = createTextStyle(FontWeight.Light, FontSizes.SUBTITLE_MEDIUM_FONT_SIZE, FontSizes.SUBTITLE_MEDIUM_LINE_HEIGHT, FontStyle.Italic),
    val subtitleMediumLight: TextStyle = createTextStyle(FontWeight.Light, FontSizes.SUBTITLE_MEDIUM_FONT_SIZE, FontSizes.SUBTITLE_MEDIUM_LINE_HEIGHT),
    val subtitleMediumMedium: TextStyle = createTextStyle(FontWeight.Medium, FontSizes.SUBTITLE_MEDIUM_FONT_SIZE, FontSizes.SUBTITLE_MEDIUM_LINE_HEIGHT),
    val subtitleMediumSemiBold: TextStyle = createTextStyle(FontWeight.SemiBold, FontSizes.SUBTITLE_MEDIUM_FONT_SIZE, FontSizes.SUBTITLE_MEDIUM_LINE_HEIGHT),
    val subtitleMediumThinItalic: TextStyle = createTextStyle(FontWeight.Thin, FontSizes.SUBTITLE_MEDIUM_FONT_SIZE, FontSizes.SUBTITLE_MEDIUM_LINE_HEIGHT, FontStyle.Italic),
    val subtitleMediumThin: TextStyle = createTextStyle(FontWeight.Thin, FontSizes.SUBTITLE_MEDIUM_FONT_SIZE, FontSizes.SUBTITLE_MEDIUM_LINE_HEIGHT),
    val subtitleMediumSans: TextStyle = createTextStyle(FontWeight.Normal, FontSizes.SUBTITLE_MEDIUM_FONT_SIZE, FontSizes.SUBTITLE_MEDIUM_LINE_HEIGHT),

    // Subtitle Small Variations
    val subtitleSmallBold: TextStyle = createTextStyle(FontWeight.Bold, FontSizes.SUBTITLE_SMALL_FONT_SIZE, FontSizes.SUBTITLE_SMALL_LINE_HEIGHT),
    val subtitleSmallExtraBold: TextStyle = createTextStyle(FontWeight.ExtraBold, FontSizes.SUBTITLE_SMALL_FONT_SIZE, FontSizes.SUBTITLE_SMALL_LINE_HEIGHT),
    val subtitleSmallExtraLightItalic: TextStyle = createTextStyle(FontWeight.ExtraLight, FontSizes.SUBTITLE_SMALL_FONT_SIZE, FontSizes.SUBTITLE_SMALL_LINE_HEIGHT, FontStyle.Italic),
    val subtitleSmallExtraLight: TextStyle = createTextStyle(FontWeight.ExtraLight, FontSizes.SUBTITLE_SMALL_FONT_SIZE, FontSizes.SUBTITLE_SMALL_LINE_HEIGHT),
    val subtitleSmallItalic: TextStyle = createTextStyle(FontWeight.Normal, FontSizes.SUBTITLE_SMALL_FONT_SIZE, FontSizes.SUBTITLE_SMALL_LINE_HEIGHT, FontStyle.Italic),
    val subtitleSmallLightItalic: TextStyle = createTextStyle(FontWeight.Light, FontSizes.SUBTITLE_SMALL_FONT_SIZE, FontSizes.SUBTITLE_SMALL_LINE_HEIGHT, FontStyle.Italic),
    val subtitleSmallLight: TextStyle = createTextStyle(FontWeight.Light, FontSizes.SUBTITLE_SMALL_FONT_SIZE, FontSizes.SUBTITLE_SMALL_LINE_HEIGHT),
    val subtitleSmallMedium: TextStyle = createTextStyle(FontWeight.Medium, FontSizes.SUBTITLE_SMALL_FONT_SIZE, FontSizes.SUBTITLE_SMALL_LINE_HEIGHT),
    val subtitleSmallSemiBold: TextStyle = createTextStyle(FontWeight.SemiBold, FontSizes.SUBTITLE_SMALL_FONT_SIZE, FontSizes.SUBTITLE_SMALL_LINE_HEIGHT),
    val subtitleSmallThinItalic: TextStyle = createTextStyle(FontWeight.Thin, FontSizes.SUBTITLE_SMALL_FONT_SIZE, FontSizes.SUBTITLE_SMALL_LINE_HEIGHT, FontStyle.Italic),
    val subtitleSmallThin: TextStyle = createTextStyle(FontWeight.Thin, FontSizes.SUBTITLE_SMALL_FONT_SIZE, FontSizes.SUBTITLE_SMALL_LINE_HEIGHT),
    val subtitleSmallSans: TextStyle = createTextStyle(FontWeight.Normal, FontSizes.SUBTITLE_SMALL_FONT_SIZE, FontSizes.SUBTITLE_SMALL_LINE_HEIGHT),

    // Body Large Variations
    val bodyLargeBold: TextStyle = createTextStyle(FontWeight.Bold, FontSizes.BODY_LARGE_FONT_SIZE, FontSizes.BODY_LARGE_LINE_HEIGHT),
    val bodyLargeExtraBold: TextStyle = createTextStyle(FontWeight.ExtraBold, FontSizes.BODY_LARGE_FONT_SIZE, FontSizes.BODY_LARGE_LINE_HEIGHT),
    val bodyLargeExtraLightItalic: TextStyle = createTextStyle(FontWeight.ExtraLight, FontSizes.BODY_LARGE_FONT_SIZE, FontSizes.BODY_LARGE_LINE_HEIGHT, FontStyle.Italic),
    val bodyLargeExtraLight: TextStyle = createTextStyle(FontWeight.ExtraLight, FontSizes.BODY_LARGE_FONT_SIZE, FontSizes.BODY_LARGE_LINE_HEIGHT),
    val bodyLargeItalic: TextStyle = createTextStyle(FontWeight.Normal, FontSizes.BODY_LARGE_FONT_SIZE, FontSizes.BODY_LARGE_LINE_HEIGHT, FontStyle.Italic),
    val bodyLargeLightItalic: TextStyle = createTextStyle(FontWeight.Light, FontSizes.BODY_LARGE_FONT_SIZE, FontSizes.BODY_LARGE_LINE_HEIGHT, FontStyle.Italic),
    val bodyLargeLight: TextStyle = createTextStyle(FontWeight.Light, FontSizes.BODY_LARGE_FONT_SIZE, FontSizes.BODY_LARGE_LINE_HEIGHT),
    val bodyLargeMedium: TextStyle = createTextStyle(FontWeight.Medium, FontSizes.BODY_LARGE_FONT_SIZE, FontSizes.BODY_LARGE_LINE_HEIGHT),
    val bodyLargeSemiBold: TextStyle = createTextStyle(FontWeight.SemiBold, FontSizes.BODY_LARGE_FONT_SIZE, FontSizes.BODY_LARGE_LINE_HEIGHT),
    val bodyLargeThinItalic: TextStyle = createTextStyle(FontWeight.Thin, FontSizes.BODY_LARGE_FONT_SIZE, FontSizes.BODY_LARGE_LINE_HEIGHT, FontStyle.Italic),
    val bodyLargeThin: TextStyle = createTextStyle(FontWeight.Thin, FontSizes.BODY_LARGE_FONT_SIZE, FontSizes.BODY_LARGE_LINE_HEIGHT),
    val bodyLargeSans: TextStyle = createTextStyle(FontWeight.Normal, FontSizes.BODY_LARGE_FONT_SIZE, FontSizes.BODY_LARGE_LINE_HEIGHT),

    // Body Medium Variations
    val bodyMediumBold: TextStyle = createTextStyle(FontWeight.Bold, FontSizes.BODY_MEDIUM_FONT_SIZE, FontSizes.BODY_MEDIUM_LINE_HEIGHT),
    val bodyMediumExtraBold: TextStyle = createTextStyle(FontWeight.ExtraBold, FontSizes.BODY_MEDIUM_FONT_SIZE, FontSizes.BODY_MEDIUM_LINE_HEIGHT),
    val bodyMediumExtraLightItalic: TextStyle = createTextStyle(FontWeight.ExtraLight, FontSizes.BODY_MEDIUM_FONT_SIZE, FontSizes.BODY_MEDIUM_LINE_HEIGHT, FontStyle.Italic),
    val bodyMediumExtraLight: TextStyle = createTextStyle(FontWeight.ExtraLight, FontSizes.BODY_MEDIUM_FONT_SIZE, FontSizes.BODY_MEDIUM_LINE_HEIGHT),
    val bodyMediumItalic: TextStyle = createTextStyle(FontWeight.Normal, FontSizes.BODY_MEDIUM_FONT_SIZE, FontSizes.BODY_MEDIUM_LINE_HEIGHT, FontStyle.Italic),
    val bodyMediumLightItalic: TextStyle = createTextStyle(FontWeight.Light, FontSizes.BODY_MEDIUM_FONT_SIZE, FontSizes.BODY_MEDIUM_LINE_HEIGHT, FontStyle.Italic),
    val bodyMediumLight: TextStyle = createTextStyle(FontWeight.Light, FontSizes.BODY_MEDIUM_FONT_SIZE, FontSizes.BODY_MEDIUM_LINE_HEIGHT),
    val bodyMediumMedium: TextStyle = createTextStyle(FontWeight.Medium, FontSizes.BODY_MEDIUM_FONT_SIZE, FontSizes.BODY_MEDIUM_LINE_HEIGHT),
    val bodyMediumSemiBold: TextStyle = createTextStyle(FontWeight.SemiBold, FontSizes.BODY_MEDIUM_FONT_SIZE, FontSizes.BODY_MEDIUM_LINE_HEIGHT),
    val bodyMediumThinItalic: TextStyle = createTextStyle(FontWeight.Thin, FontSizes.BODY_MEDIUM_FONT_SIZE, FontSizes.BODY_MEDIUM_LINE_HEIGHT, FontStyle.Italic),
    val bodyMediumThin: TextStyle = createTextStyle(FontWeight.Thin, FontSizes.BODY_MEDIUM_FONT_SIZE, FontSizes.BODY_MEDIUM_LINE_HEIGHT),
    val bodyMediumSans: TextStyle = createTextStyle(FontWeight.Normal, FontSizes.BODY_MEDIUM_FONT_SIZE, FontSizes.BODY_MEDIUM_LINE_HEIGHT),

    // Body Small Variations
    val bodySmallBold: TextStyle = createTextStyle(FontWeight.Bold, FontSizes.BODY_SMALL_FONT_SIZE, FontSizes.BODY_SMALL_LINE_HEIGHT),
    val bodySmallExtraBold: TextStyle = createTextStyle(FontWeight.ExtraBold, FontSizes.BODY_SMALL_FONT_SIZE, FontSizes.BODY_SMALL_LINE_HEIGHT),
    val bodySmallExtraLightItalic: TextStyle = createTextStyle(FontWeight.ExtraLight, FontSizes.BODY_SMALL_FONT_SIZE, FontSizes.BODY_SMALL_LINE_HEIGHT, FontStyle.Italic),
    val bodySmallExtraLight: TextStyle = createTextStyle(FontWeight.ExtraLight, FontSizes.BODY_SMALL_FONT_SIZE, FontSizes.BODY_SMALL_LINE_HEIGHT),
    val bodySmallItalic: TextStyle = createTextStyle(FontWeight.Normal, FontSizes.BODY_SMALL_FONT_SIZE, FontSizes.BODY_SMALL_LINE_HEIGHT, FontStyle.Italic),
    val bodySmallLightItalic: TextStyle = createTextStyle(FontWeight.Light, FontSizes.BODY_SMALL_FONT_SIZE, FontSizes.BODY_SMALL_LINE_HEIGHT, FontStyle.Italic),
    val bodySmallLight: TextStyle = createTextStyle(FontWeight.Light, FontSizes.BODY_SMALL_FONT_SIZE, FontSizes.BODY_SMALL_LINE_HEIGHT),
    val bodySmallMedium: TextStyle = createTextStyle(FontWeight.Medium, FontSizes.BODY_SMALL_FONT_SIZE, FontSizes.BODY_SMALL_LINE_HEIGHT),
    val bodySmallSemiBold: TextStyle = createTextStyle(FontWeight.SemiBold, FontSizes.BODY_SMALL_FONT_SIZE, FontSizes.BODY_SMALL_LINE_HEIGHT),
    val bodySmallThinItalic: TextStyle = createTextStyle(FontWeight.Thin, FontSizes.BODY_SMALL_FONT_SIZE, FontSizes.BODY_SMALL_LINE_HEIGHT, FontStyle.Italic),
    val bodySmallThin: TextStyle = createTextStyle(FontWeight.Thin, FontSizes.BODY_SMALL_FONT_SIZE, FontSizes.BODY_SMALL_LINE_HEIGHT),
    val bodySmallSans: TextStyle = createTextStyle(FontWeight.Normal, FontSizes.BODY_SMALL_FONT_SIZE, FontSizes.BODY_SMALL_LINE_HEIGHT)
) {
    companion object {
        private val defaultFontFamily = CustomFonts.dmSans()

        private fun createTextStyle(
            fontWeight: FontWeight,
            fontSize: Int,
            lineHeight: Int,
            fontStyle: FontStyle = FontStyle.Normal
        ): TextStyle {
            return TextStyle(
                fontFamily = defaultFontFamily,
                fontWeight = fontWeight,
                fontSize = fontSize.sp,
                lineHeight = lineHeight.sp,
                fontStyle = fontStyle
            )
        }
    }
}

val LocalFontProvider = staticCompositionLocalOf<FontResourcesProvider> {
    error("No Typography provided")
}