package com.example.whatsapp

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun Entrada(navController: NavController, modifier: Modifier){
    LazyColumn(modifier = modifier.fillMaxSize()){
        val lista = BaseDatos.baseDatos.get()
        items(1){
            //for (contactos in lista){
            //    Row {
            //
            //    }
            //}
        }
    }
}