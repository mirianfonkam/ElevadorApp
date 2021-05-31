package com.g.elevadorapp

class Elevador(val capacidade : Int = 1, val total_andares : Int = 1, var andar_atual : Int = 0, var qty_pessoas : Int = 0){

    fun checarCapacidade() : Boolean {
        return this.qty_pessoas + 1 <= this.capacidade
    }

    fun updateAndar (num: Int) {
        if (num <= this.total_andares) { // in 0 .. qty_tanday
            this.andar_atual = num
        }
    }

    fun addPessoa() {
        if (this.checarCapacidade()) {
            this.qty_pessoas += 1
        }
    }

    fun tirarPessoa() {
        if (qty_pessoas > 0) {
            this.qty_pessoas -= 1
        }
    }
}
