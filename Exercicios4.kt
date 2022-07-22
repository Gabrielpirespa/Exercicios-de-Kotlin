/* Lista de Exercícios 4

1 - Escreva um programa capaz de ler dois número inteiros que representam os lados de uma figura geométrica. Informar se
formam um quadrado (lados iguais).

2 - Escreva um programa capaz de ler três número inteiros que representam os lados de um triângulo. Informar se
é um triângulo equilátero (todos os lados iguais).

3 - Escreva um programa para ser usado na portaria de um evento.

a) Peça a idade. Menores de idade não são permitidos. Mensagem: "Negado. Menores de idade não são permitidos.".

b) Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum destes.
Mensagem: "Negado. Convite inválido.".

c) Peça o código do convite. Convites premium e luxo começam com "XL". Convites comuns com "XT". Caso o código não este-
ja nos padrões, negar a entrada. Mensagem: "Negado. Convite inválido.".

d) Caso todos os critérios sejam atendidos, exibir "Bem vindo!".

*/

fun main() {
    portaria()
}

//Exercício 1
fun quadrado() {
    print("Informe o lado 1: ")
    val int1 = readLine()
    print("Informe o lado 2: ")
    val int2 = readLine()

    if (int1 != null && int1 != "" && int2 != null && int2 != "") {
        val x = int1.toInt()
        val y = int2.toInt()

        if (x == y) {
            println("A figura é um quadrado.")
        } else {
            println("A figura não é um quadrado.")
        }
    }
}

//Exercício 2
fun triangulo() {
    print("Digite o primeiro lado: ")
    val int1 = readLine()
    print("Digite o segundo lado: ")
    val int2 = readLine()
    print("Digite o terceiro lado: ")
    val int3 = readLine()

    if (int1 != null && int1 != "" && int2 != null && int2 != "" && int3 != null && int3 != "") {
        val x = int1.toInt()
        val y = int2.toInt()
        val z = int3.toInt()

        if (x == y && y == z) {
            println("O triângulo é equilátero.")
        } else {
            println("O triângulo não é equilátero.")
        }

    }
}

//Exercício 3
fun portaria() {

    print("Digite sua idade: ")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos.")
            return
        }
    }

    print("Digite seu tipo de convite: ")
    var tipoConvite = readLine()

    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()

        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. Convite inválido.")
            return
        }
    }

    print("Digite o código do seu convite: ")
    var codigo = readLine()

    if (codigo != null && codigo != "") {
        codigo = codigo.lowercase()

        if ((tipoConvite == "premium" || tipoConvite == "luxo") && !codigo.startsWith("xl")) {
            println("Negado. Convite inválido.")
        } else if (tipoConvite == "comum" && !codigo.startsWith("xt")) {
            println("Negado. Convite inválido.")
        } else {
            println("Bem vindo!")
        }
    }
}