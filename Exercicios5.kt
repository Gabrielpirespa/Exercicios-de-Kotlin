/* Controle de fluxo - for
1 - Imprima os números de 1 a 50 na mesma linha em ordem crescente.

2 - Imprima os números de 1 a 50 na mesma linha em ordem decrescente.

3 - Usando a resolução do exercício 1, não imprima os números múltiplos de 5.

4 - Faça a soma de todos os números no intervalo de 1 a 500.

5 - Escreva um programa capaz de receber um número inteiro N e imprimir uma escada de tamanho N usando o caracter #.
Se a entrada for 3 teremos:
#
##
###
 */
fun main() {
    jogovelha(10)
}

//Exercício 1
fun crescente() {
    for (c in 1..50) {
        print("$c ")
    }
}

//Exercício 2
fun decrescente() {
    for (d in 50 downTo 0) {
        print("$d ")
    }
}

//Exercício 3
fun crescente5() {
    for (c in 1..50) {
        if (c % 5 != 0) {
            print("$c ")
        }
    }
}

//Exercício 4
fun ex4() {
    var soma = 0
    for (i in 1..500) {
        soma += i
    }
    println(soma)
}

//Exercício 5
fun jogovelha(N: Int) {

    for (i in 1..N) { // Essa linha determina quantos degraus a escada deve ter.
        for (j in 1 .. i ){ // Escreve # na mesma linha pelo tanto de vezes representados pelo número i.
            print("#")
        }
        println() //Cria o efeito de escada, fazendo a escrita de # saltar uma linha quando mudado o iterador i.
    }
}


