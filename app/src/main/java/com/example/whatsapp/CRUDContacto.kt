package com.example.whatsapp

import com.google.firebase.Firebase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore

class CRUDContacto {
    companion object{
        val db = Firebase.firestore
        val baseDatos = db.collection("WhatsApp")
        fun añadirContacto(){
            val lista = listOf(
                Contacto(1,"Alejandro Sosa García", 123456789, "Hombre"),
                Contacto(2,"Angel Navarro Mesas", 987654321, "Hombre"),
                Contacto(3,"David Bermúdez Alcántara", 666666666, "Hombre"),
                Contacto(4,"Alejandro Mulero Muletas", 123456789, "Hombre"),
                Contacto(5,"Francisco Javier ", 987654321, "Hombre"),
                Contacto(6,"Rubén Lindes ", 612511120, "Hombre"),
                Contacto(7,"David Perea ", 123456789, "Hombre"),
                Contacto(8,"Claudia Mendoza", 666666666, "Mujer"),
                Contacto(9,"Lydia Pérez González", 123456789, "Mujer"),
                Contacto(10,"Carmen Martín Núñez", 987654321, "Mujer"),
                Contacto(11,"Antonio Navarro", 666666666, "Hombre"),
                Contacto(12,"Fernando José Miguel Gómez", 123456789, "Hombre"),
                Contacto(13,"Britany Sanchez Ballón", 987654321, "Mujer"),
                Contacto(14,"Yeray Jimenez", 666666666, "Hombre"),
                Contacto(15,"Juan Manuel Sánchez Moreno", 123456789, "Hombre"))
            // Subimos cada Contacto de la lista a la base de datos.
            for (contacto in lista){
                db.collection("WhatsApp").add(contacto)
            }
        }
        fun mostrarContactos(): MutableList<Contacto> {
            var lista : MutableList<Contacto> = arrayListOf()
            db.collection("WhatsApp")
                .whereEqualTo("Contacto", true)
                .get()
                .addOnSuccessListener { contactos ->
                    for (contacto in contactos) {

                    }
                }
            return lista
        }
    }
}