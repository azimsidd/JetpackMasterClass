package com.thecodingshef.jetpackmasterclass.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.thecodingshef.jetpackmasterclass.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,[[
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

val Typography.bold14: TextStyle
    @Composable get() {
        return TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            fontFamily = FontFamily(Font(R.font.popins_medium))
        )
    }


val Typography.bold20: TextStyle
    @Composable get() {
        return TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            fontFamily = FontFamily(Font(R.font.popins_medium))
        )
    }

val Typography.bold30: TextStyle
    @Composable get() {
        return TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            fontFamily = FontFamily(Font(R.font.popins_medium))
        )
    }

val Typography.medium20: TextStyle
    @Composable get() {
        return TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Gray,
            fontFamily = FontFamily(Font(R.font.popins_medium))
        )
    }

val Typography.normal14: TextStyle
    @Composable get() {
        return TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Gray,
            fontFamily = FontFamily(Font(R.font.popins_medium))
        )
    }