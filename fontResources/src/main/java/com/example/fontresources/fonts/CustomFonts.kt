package com.example.fontresources.fonts

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.fontresources.R

internal object CustomFonts {
    fun dmSans() = FontFamily(
        Font(resId = R.font.dm_sans_black, weight = FontWeight.Black, style = FontStyle.Normal),
        Font(resId = R.font.dm_sans_bold, weight = FontWeight.Bold, style = FontStyle.Normal),
        Font(resId = R.font.dm_sans_extrabold, weight = FontWeight.ExtraBold, style = FontStyle.Normal),
        Font(resId = R.font.dm_sans_extralight_italic, weight = FontWeight.ExtraLight, style = FontStyle.Italic),
        Font(resId = R.font.dm_sans_extralight, weight = FontWeight.ExtraLight, style = FontStyle.Normal),
        Font(resId = R.font.dm_sans_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
        Font(resId = R.font.dm_sans_light_italic, weight = FontWeight.Light, style = FontStyle.Italic),
        Font(resId = R.font.dm_sans_light, weight = FontWeight.Light, style = FontStyle.Normal),
        Font(resId = R.font.dm_sans_medium, weight = FontWeight.Medium, style = FontStyle.Normal),
        Font(resId = R.font.dm_sans_semibold, weight = FontWeight.SemiBold, style = FontStyle.Normal),
        Font(resId = R.font.dm_sans_thin_italic, weight = FontWeight.Thin, style = FontStyle.Italic),
        Font(resId = R.font.dm_sans_thin, weight = FontWeight.Thin, style = FontStyle.Normal),
        Font(resId = R.font.dm_sans, weight = FontWeight.Normal, style = FontStyle.Normal)
    )
}