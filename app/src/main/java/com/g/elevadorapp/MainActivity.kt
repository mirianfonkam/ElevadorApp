package com.g.elevadorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    val ev = Elevador(5,12, 5, 0 )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val evAndarIn = findViewById<TextInputEditText>(R.id.andar_in)

        val evTotalPessoas = findViewById<TextView>(R.id.ev_result)
        evTotalPessoas.text = getString(R.string.ev_num_pessoas,ev.total_pessoas,ev.capacidade_pessoas)


        val evAndarOut = findViewById<TextView>(R.id.andar_out)
        evAndarOut.text = getString(R.string.ev_andar, ev.andar_atual)

        val btnEntrar = findViewById<MaterialButton>(R.id.btn_entrar)
        val btnSair = findViewById<MaterialButton>(R.id.btn_sair)
        val btnAndar = findViewById<MaterialButton>(R.id.btn_andar)

        btnEntrar.setOnClickListener {
            ev.addPessoa()
            evTotalPessoas.text = getString(R.string.ev_num_pessoas,ev.total_pessoas,ev.capacidade_pessoas)
        }

        btnSair.setOnClickListener{
            ev.tirarPessoa()
            evTotalPessoas.text = getString(R.string.ev_num_pessoas,ev.total_pessoas,ev.capacidade_pessoas)
        }

        btnAndar.setOnClickListener{
            val andar = evAndarIn.text.toString().toInt()
            ev.updateAndar(andar)
            evAndarOut.text = getString(R.string.ev_andar, ev.andar_atual)
        }
    }
}