package com.example.whatsapp

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(navController : NavController, context: Context, modifier: Modifier){
    var text by rememberSaveable {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var toast : Toast
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize()
    ){
        Image(painter = painterResource(id = R.drawable.login),
            contentDescription = "Foto login")
        Spacer(modifier = Modifier.height(100.dp))
        TextField(value = text,
            onValueChange = {text = it},
            label = { Text(text = "Usuario") })
        TextField(value = password,
            onValueChange = {password = it},
            label = { Text(text = "Contraseña") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = {
            if (text.equals("prueba") && password.equals("1234"))
            navController.navigate("Entrada")
            else{
                toast = Toast.makeText(context, "Usuario o contraseña incorrectos", Toast.LENGTH_LONG)
                toast.show()
            }
        }) {
            Text(text = "Entrar")

        }
    }
}