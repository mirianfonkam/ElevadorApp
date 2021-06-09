package com.g.elevadorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    val ev = Elevador(5,12, 0, 0 )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEntrar = findViewById<MaterialButton>(R.id.btn_entrar)
        val evTotalPessoas = findViewById<TextView>(R.id.ev_result)
        val evAndarIn = findViewById<TextInputEditText>(R.id.andar_in)
        val evAndarOut = findViewById<TextView>(R.id.andar_out)
        val btnSair = findViewById<MaterialButton>(R.id.btn_sair)
        val btnAndar = findViewById<MaterialButton>(R.id.btn_andar)

        btnEntrar.setOnClickListener {
            ev.addPessoa()
            evTotalPessoas.text = "${ev.total_pessoas}/5"
        }

        btnSair.setOnClickListener{
            ev.tirarPessoa()
            evTotalPessoas.text =  "${ev.total_pessoas}/5"
        }

        btnAndar.setOnClickListener{
            val andar = evAndarIn.text.toString().toInt()
            ev.updateAndar(andar)
            evAndarOut.text = "${ev.andar_atual}º \nandar"
        }


    }
}