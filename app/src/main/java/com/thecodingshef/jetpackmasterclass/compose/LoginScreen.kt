package com.thecodingshef.jetpackmasterclass.compose

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thecodingshef.jetpackmasterclass.ui.theme.SkyBlueShade
import com.thecodingshef.jetpackmasterclass.ui.theme.bold30
import com.thecodingshef.jetpackmasterclass.ui.theme.normal14


@Preview(showBackground = true)
@Composable
fun LoginScreen() {


    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        val userNameValue = remember {
            mutableStateOf("")
        }


        val passwordValue = remember {
            mutableStateOf("")
        }

        Text(
            text = "Login\n" + "Welcome back!",
            style = MaterialTheme.typography.bold30.copy(color = Color.Black),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 150.dp)
        )

        Spacer(modifier = Modifier.padding(10.dp))

        OutlinedTextField(value = userNameValue.value,
            onValueChange = { userName ->
                userNameValue.value = userName
            },
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                Text(text = "Enter Your Username / Email")
            },
            trailingIcon = {
                Icon(imageVector = Icons.Default.AccountBox, contentDescription = "")
            }
        )

        Spacer(modifier = Modifier.padding(10.dp))

        OutlinedTextField(
            value = passwordValue.value,
            onValueChange = { password ->
                passwordValue.value = password
            },
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                Text(text = "Enter Your Password")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            trailingIcon = {
                Icon(imageVector = Icons.Default.Lock, contentDescription = "")
            }
        )

        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = "Forget password",
            style = MaterialTheme.typography.normal14.copy(color = SkyBlueShade),
            textAlign = TextAlign.Center,
            modifier = Modifier
        )

        Spacer(modifier = Modifier.padding(10.dp))

        val isLoginButtonEnable =
            userNameValue.value.isNotEmpty() && passwordValue.value.isNotEmpty()

        Button(
            enabled = isLoginButtonEnable,
            onClick = {
                Toast.makeText(context, "Login click", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier
                .background(
                    color = if (isLoginButtonEnable) Color.Red else Color.Gray,
                    shape = RoundedCornerShape(8.dp)
                )
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
        ) {
            Text(
                text = "Login",
                style = MaterialTheme.typography.normal14.copy(color = Color.White)
            )
        }

        Spacer(modifier = Modifier.padding(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        ) {
            Text(text = "Dont have an account? ")
            Text(
                text = "Sign up",
                style = MaterialTheme.typography.normal14.copy(color = Color.Blue),
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        DividerRowSection(text = "OR")

    }

}

@Preview(showBackground = true)
@Composable
fun DividerRowSection(modifier: Modifier = Modifier, text: String = "") {

    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Divider(Modifier.weight(1f))
        Text(
            text = text,
            style = MaterialTheme.typography.normal14.copy(color = Color.Black),
            modifier = Modifier.padding(start = 8.dp)
        )
        Divider(Modifier.weight(1f))
    }

}