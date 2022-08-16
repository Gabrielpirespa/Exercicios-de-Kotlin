package business

import entity.Convidado

class ConvidadoBusiness {
    fun tipoValido(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")
    //tipoValido retorna verdadeiro se a String for uma das três estipuladas.

    fun maiorDeIdade(idade: Int) = idade >= 18 //Verifica se o convidade é maior de idade, setando true se sim

    fun convidadoValido(convite: Convidado) = when (convite.tipo) { //Valida o convite de acordo com o código e o tipo
        "comum" -> convite.codigo.startsWith("xt") // Quando (when) comum e começa com xt retorna true
        "premium", "luxo" -> convite.codigo.startsWith("xl") // Quando (when) premium ou luxo e começa com xl retorna true
        else -> false // Quando não satisfaz nenhuma das definições retorna false
    }
}
