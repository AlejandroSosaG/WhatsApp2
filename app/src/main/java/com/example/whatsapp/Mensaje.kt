package com.example.whatsapp

import com.google.firebase.Timestamp

class Mensaje (val id : Int, val mensaje: String, val actual : Timestamp, val idSender : Int, val idReceiver : Int, val check : Boolean)