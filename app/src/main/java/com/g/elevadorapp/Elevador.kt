package com.g.elevadorapp

class Elevador(val capacidade : Int = 1, val total_andares : Int = 1, var andar_atual : Int = 0, var total_pessoas : Int = 0){

    fun checarCapacidade() : Boolean {
        return this.total_pessoas + 1 <= this.capacidade
    }

    fun updateAndar (num: Int) {
        if (num in 1..total_andares) { // in 1 .. qty_tanday
            this.andar_atual = num
        }
    }

    fun addPessoa() {
        if (this.checarCapacidade()) {
            this.total_pessoas++
        }
    }

    fun tirarPessoa() {
        if (total_pessoas > 0) {
            this.total_pessoas--
        }
    }
}
