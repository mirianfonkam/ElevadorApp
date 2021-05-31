package com.g.elevadorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    val ev = Elevador(5,12, 5, 2 )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEntrar = findViewById<MaterialButton>(R.id.btn_entrar)
        val evQtyPessoa = findViewById<TextView>(R.id.ev_result)
        val btnSair = findViewById<MaterialButton>(R.id.btn_sair)

        btnEntrar.setOnClickListener {
            ev.addPessoa()
            evQtyPessoa.text = "${ev.qty_pessoas}/5 \n pessoas no \n elevador"
        }

        btnSair.setOnClickListener{
            ev.tirarPessoa()
            evQtyPessoa.text =  "${ev.qty_pessoas}/5 \n pessoas no \n elevador"
        }

    //    btnAndar.setOnClickListener{
//            ev.updateAndar(numInput)
//        }


    }
}