package com.nutrisport.shared

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import nutrisport.shared.generated.resources.Poppins_Bold
import nutrisport.shared.generated.resources.Poppins_Medium
import nutrisport.shared.generated.resources.Poppins_Regular
import org.jetbrains.compose.resources.Font
import nutrisport.shared.generated.resources.Res

@Composable
fun PoppinsFontRegular() = FontFamily(
    Font(Res.font.Poppins_Regular)
)

@Composable
fun PoppinsFontBold() = FontFamily(
    Font(Res.font.Poppins_Bold)
)

@Composable
fun PoppinsFontMedium() = FontFamily(
    Font(Res.font.Poppins_Medium)
)


object FontSize {
     val EXTRA_SMALL = 10.sp
     val SMALL = 12.sp
     val REGULAR = 14.sp
     val EXTRA_REGULAR = 16.sp
     val MEDIUM = 18.sp
     val EXTRA_MEDIUM = 20.sp
     val LARGE = 30.sp
     val EXTRA_LARGE = 40.sp
}
