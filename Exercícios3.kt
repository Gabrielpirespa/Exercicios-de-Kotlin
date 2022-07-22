/* 1 - Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no final do ano. Os bo-
nus são classificados por cargo.
a. Gerentes recebem R$ 2.000,00
b. Coordenadores recebem R$ 1.500,00
c. Engenheiro de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00

2 - Modifique o primeiro exercício para considerar o tempo de experiência no cálculo de bônus.
a. Gerentes com menos de 2 anos de experiência recebem R$ 2.000,00, caso contrário recebem R$ 3.000,00
b. Coordenadores com menos de 1 ano de experiência recebem R$ 1.500,00, caso contrário recebem R$ 1.800,00
c. Engenheiro de software recebem R$1.000,00
d. Estagiários recebem R$ 500,00

*/

//Exercício 1
fun bonusex1(cargo: String): Float {

    var bonusex1 = 0f

    if (cargo == "Gerente") {
        return 2000f
    } else if (cargo == "Coordenador") {
        return 1500f
    } else if (cargo == "Engenheiro de software") {
        return 1000f
    } else if (cargo == "Estagiário") {
        return 500f
    }

    return bonusex1
}

//Exercício 2
fun bonusex2(cargo: String, experiencia: Int): Float {

    var bonusex2 = 0f

    if (cargo == "Gerente") {
        bonusex2 = if (experiencia < 2) {
            2000f
        } else {
            3000f
        }
    } else if (cargo == "Coordenador") {
        bonusex2 = if (experiencia < 1) {
            1500f
        } else {
            1800f
        }
    } else if (cargo == "Engenheiro de software") {
        return 1000f
    } else if (cargo == "Estagiário") {
        return 500f
    }

    return bonusex2
}

fun main() {
    println(bonusex1("Gerente"))
}