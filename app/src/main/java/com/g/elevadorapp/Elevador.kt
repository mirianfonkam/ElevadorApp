package com.g.elevadorapp

class Elevador(val capacidade : Int = 1, val qty_andar : Int = 1, var andar_atual : Int = 0, var qty_pessoas : Int = 0){

    private fun checarCapacidade() : Boolean {
        return this.qty_pessoas + 1 <= this.capacidade
    }

    private fun updateAndar (num: Int) {
        if (num <= this.qty_andar) {
            this.andar_atual = num
        }
    }

    private fun addPessoa() {
        if (this.checarCapacidade()) {
            this.qty_pessoas += 1
        }
    }

    private fun tirarPessoa() {
        this.qty_pessoas -= 1
    }
}
