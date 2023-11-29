package com.example.whatsapp

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.google.firebase.firestore.toObject

@Composable
fun Entrada(navController: NavController, modifier: Modifier){
    LazyColumn(modifier = modifier.fillMaxSize()){
        val contactos = CRUDContacto.mostrarContactos()
        CRUDContacto.añadirContacto()
        items(1){
            for (contacto in contactos){
                Row {

                }
            }
        }
    }
}  