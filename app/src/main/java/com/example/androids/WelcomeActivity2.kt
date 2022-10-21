package com.example.androids

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar

class WelcomeActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome2)
        setSupportActionBar(findViewById(R.id.my_barra))


    }



        override fun onCreateOptionsMenu(menu: Menu?): Boolean {

            menuInflater.inflate(R.menu.menu_barra, menu)
            return super.onCreateOptionsMenu(menu)
        }


    override fun onOptionsItemSelected(item:MenuItem):Boolean=when(item.itemId){
        R.id.itm_buscar->{
            Toast.makeText(this,"entro en el item",Toast.LENGTH_LONG).show()
            true
        }
    }
    else->{
        super.onOptionsItemSelected(item)
    }

    }