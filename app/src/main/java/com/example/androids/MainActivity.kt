package com.example.androids

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AlertDialog
import android.view.Menu
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private var edtusuario:EditText?=null
    private var edtclave:EditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab:View=findViewById(R.id.BotonFlotante)
        fab.setOnClickListener{
            View->Snackbar.make(View,"practica de floating buton",Snackbar.LENGTH_LONG).show()

        }


        edtusuario=findViewById(R.id.edtusuario)  //concatenacion de parte grafica-logica
        edtclave=findViewById(R.id.edtclave)
    }

    /*
    fun login(btnEntrar: View){
        //validacion credenciales
        if(edtUsuario!!.text.toString()=="usuario@"){
            if(edtClave!!.text.toString()=="1234"){
                val intento= Intent(this,WelcomeActivity2::class.java)
                startActivity(intento)
            }
        }


    } */
    fun login(btnlogin:View){
        var username:String=edtusuario!!.text.toString()
        var password:String=edtclave!!.text.toString()

        val positiveButton={
                dialog: DialogInterface,entero:Int->
            val intento= Intent(this,WelcomeActivity2::class.java)
            startActivity(intento)
        }

        val negativeButton={xx:DialogInterface,yy:Int->}

        if(username=="usuario@"&& password=="1234"){

            val dialogo=AlertDialog.Builder(this)
                .setTitle("Bienvenido"+ username)
                .setMessage(R.string.alert_mensaje)
                .setPositiveButton("ok",positiveButton)
                .setNegativeButton("Cancelar",negativeButton)
                .create().show()



        }
        else{

        }
    }


    }
