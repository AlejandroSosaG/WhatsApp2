package com.example.whatsapp

import com.google.firebase.firestore.FirebaseFirestore

class BaseDatos {
    companion object{
        val db = FirebaseFirestore.getInstance()
        val baseDatos = db.collection("WhatsApp")
        fun añadirChat(contacto: Contacto){
            baseDatos.add(contacto)
        }
        fun borrarChat(contacto: Contacto){

        }
    }
}