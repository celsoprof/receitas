package br.dev.celso.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.dev.celso.R
import br.dev.celso.ui.theme.RecipeTheme

@Composable
fun SignupScreen(modifier: Modifier = Modifier) {

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                modifier = Modifier
                    .size(width = 160.dp, height = 86.dp)
                    .align(alignment = Alignment.End),
                shape = RoundedCornerShape(bottomStartPercent = 100),
                colors = CardDefaults
                    .cardColors(
                        containerColor = colorResource(R.color.primary)
                    )
            ) {}

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(48.dp)
            ) {
                Column {
                    Text(
                        text = "Login",
                        fontSize = 40.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        text = "Please, sign in to continue",
                        fontSize = 14.sp
                    )
                }
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(8.dp),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = "",
                                tint = colorResource(R.color.primary)
                            )
                        },
                        label = {
                            Text(text = "Your name")
                        },
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                unfocusedBorderColor = colorResource(R.color.primary)
                            )
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(8.dp),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Lock,
                                contentDescription = "",
                                tint = colorResource(R.color.primary)
                            )
                        },
                        label = {
                            Text(text = "Your password")
                        },
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                unfocusedBorderColor = colorResource(R.color.primary)
                            )
                    )
                    Spacer(modifier = Modifier.height(32.dp))
                    OutlinedButton(
                        onClick = {},
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp),
                        colors = ButtonDefaults
                            .textButtonColors(
                                containerColor = colorResource(R.color.secondary)
                            ),
                        border = BorderStroke(
                            width = 2.dp,
                            color = colorResource(R.color.primary)
                        )
                    ) {
                        Text(
                            text = "SIGN IN",
                            fontSize = 16.sp,
                            color = colorResource(R.color.primary),
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }

            Card(
                modifier = Modifier
                    .size(width = 160.dp, height = 86.dp)
                    .align(alignment = Alignment.Start),
                shape = RoundedCornerShape(topEndPercent = 100),
                colors = CardDefaults
                    .cardColors(
                        containerColor = colorResource(R.color.primary)
                    )
            ) {}
        }
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun SignupScreenPreview() {
    RecipeTheme {
        SignupScreen()
    }
}