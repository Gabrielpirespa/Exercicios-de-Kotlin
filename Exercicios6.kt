/* Controle de fluxo - while
1 - Considere uma caixa d'água de 2 mil litros. Rômulo gostaria de encher a caixa d'água com balões de água de 7 litros.
Quantos balões cabem na caixa d'água sem que o volume seja excedido?

2 - FizzBuzz. Imprima os número de 1 a 50 em ordem crescente de acordo com a regra abaixo:
a. Quando um número for divisível por 3, imprimir Buzz.
b. Quando um número for divisível por 5, imprimir Fizz.
c. Quando um número for divisível por 3 e 5, imprimir BuzzFizz.

3 - Escreva um programa capaz de receber um texto e imprimi-lo invertido.

4 - Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres 'x' e 'o' e retorna
true ou false. Caso não exista nem 'x' nem 'o', retornar false.

*/

fun main() {
    println(verifica("xXOofsadds"))
}

//Exercício 1
fun agua() {
    val capCaixa = 2000
    val capBalao = 7
    var numBaloes = 0

    while ((numBaloes * capBalao) + capBalao < capCaixa) { //Faz a soma de mais um balão, com isso o programa entende que o último balão que faz ficar maior que 2000 não deve ser contabilizado.
        numBaloes++
    }
    println("Cabem $numBaloes balões na caixa d'água.")
}

//Exercicio 2
fun buzzFizz() {
    var n = 1
    while (n <= 50) {
        if (n % 3 == 0 && n % 5 == 0) {
            print("BuzzFizz ")
        } else if (n % 5 == 0) {
            print("Fizz ")
        } else if (n % 3 == 0) {
            print("Buzz ")
        } else {
            print("$n ")
        }
        n++
    }
}

//Exercício 3
fun invertido(frase: String) {
    var i = frase.length //Transforma a frase em números
    while (0 < i) { //Como se quer inverter, a ordem da iteração é decrescente, portanto 0 é a ausência de caractere.
        i-- //Subtrai-se 1 a cada execução, fazendo com que o i, que represente o índice de cada letra na matriz string, diminua o valor.
        print("${frase[i]}") //Printa na tela a matriz string com a iteração decrescente do i.
    }
}

//Exercício 4
fun verifica(str: String): Boolean {
    var strLower = str.lowercase()
    var countX = 0
    var countO = 0
    var i = 0
    while (i < strLower.length) {
        if (strLower[i] == 'x') {
            countX++
        } else if (strLower[i] == 'o') {
            countO++
        }
        i++
    }

    return ((countX == countO) && (countX != 0))

}