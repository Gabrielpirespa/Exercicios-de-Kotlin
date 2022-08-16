package control

class Console private constructor() {
    companion object {
        fun readInt(msg: String): Int {
            var retorno: Int? = null // Seta o inteiro como inicialmente nulo
            do {    // Cria um loop forçando a dar uma entrada válida
                print(msg) // Printa a mensagem que colocar dentro do parênteses
                val info = readLine()   //Inicia a leitura do console

                if (info != null && info != "") {   //Nullsafety
                    retorno = info.toIntOrNull()

                    if (retorno == null || retorno <= 0) {  //Trata nullos e número menores ou igual a zero como entrada
                        println("Valor inválido.")
                    }
                } else {    // Trata entradas vazias " "
                    println("Valor inválido.")
                }
            } while (retorno == null || retorno <= 0) //Força a execução até inserir um número válido

            return retorno
        }

        fun readString(msg: String): String {
            var retorno: String? = null //Seta a entrada de String como inicialmente nula
            do {    // Cria um loop forçando a dar uma entrada válida
                print(msg) // Printa a mensagem que colocar dentro do parênteses
                val info = readLine() //Inicia a leitura do console

                if (info != null && info != "") { //Nullsafety
                    return info.lowercase() //Transforma todas as letras em minúsculas
                } else { // Trata entradas vazias " "
                    println("Valor inválido.")
                }
            } while (retorno == null)
            return retorno
        }
    }
}