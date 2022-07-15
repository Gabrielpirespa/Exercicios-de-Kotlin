//Exercícios

/* 1 - Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas, minutos e
segundos

2 - Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres.

3 - Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n).

4 - Escreva uma função capaz de receber milhas e converter em km (1 mph = 1.6 km)

5 - Escreva uma função capaz de receber uma string e fazer a troca de todas as letras "a" ou "A" por "x".
    a. Não deve existir lógica dentro da função main. Deve ser usada somente como ponto de entrada.
    b. Escrever uma função para a troca de letras e impressão do valor final.
    c. String final deve estar com todas as letras minúsculas.

6 - Sobre as funções criadas nos exercícios 2, 3 e 4. É possível transformá-las em funções de uma única linha? Se sim,
transforme-as. */

// Ex 1
fun anoseg(anos: Int) {
    println("$anos anos equivalem a: ")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")
}
// Ex 2
fun car(string: String) = string.length
// Ex 3
fun cubo(numero: Int) = numero * numero * numero
// Ex 4
fun mph(milhas: Float) = milhas * 1.6
// Ex 5
fun troca(palavra: String) {
    println(palavra.lowercase().replace('a', 'x'))
}

fun main() {
    anoseg(2)
    println(car("Casa"))
    println(cubo(2))
    println(mph(198.5f))
    troca("Casa")
}

