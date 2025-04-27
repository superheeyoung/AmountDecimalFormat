package com.superheeyoung.amountdecimalformat.ui.amount

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.text.font.Font
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.superheeyoung.amountdecimalformat.R
import com.superheeyoung.amountdecimalformat.ui.theme.AmountDecimalFormatTheme
import com.superheeyoung.amountdecimalformat.ui.theme.Blue500


@Composable
fun AmountScreen() {
    val uiController = rememberSystemUiController()

    val viewModel: AmountViewModel = hiltViewModel()
    val amountState by viewModel.amountState.collectAsStateWithLifecycle()

    SideEffect {
        uiController.setSystemBarsColor(
            color = Blue500,
            darkIcons = true
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.onPrimary)
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TextField(
                //mockup data
                value = "",
                onValueChange = { },
                placeholder = {
                    Text(
                        text = "0.00",
                        fontSize = 50.sp,
                        fontFamily = FontFamily(
                            Font(
                                R.font.poppins_semibold,
                                FontWeight.SemiBold
                            )
                        ),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth(),
                        color = Color.Black
                    )
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    disabledContainerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    cursorColor = Color.Black
                ),

                modifier = Modifier.align(Alignment.CenterHorizontally),
                textStyle = LocalTextStyle.current.copy(
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily(Font(R.font.poppins_semibold, FontWeight.SemiBold)),
                    fontSize = 50.sp,
                    color = Color.Black
                ),
                readOnly = true
            )
        }

    }
}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun AmountScreenPrevview() {
    AmountDecimalFormatTheme {
        AmountScreen()
    }
}