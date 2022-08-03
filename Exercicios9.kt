fun main() {
    ex12()
}

// Exercícios de treino de lógica de programação

//1- Faça um programa que peça dois números e verifique (usando if e else) e imprima o maior deles.
fun ex1() {
    try {
        print("Escreva o primeiro número: ")
        val n1 = readLine()!!.toInt()
        print("Escreva o segundo número: ")
        val n2 = readLine()!!.toInt()

        if (n1 > n2) {
            println("O maior número é $n1.")
        } else {
            println("O maior número é $n2.")
        }
    } catch (e: NumberFormatException) {
        println("Favor digitar um número.")
    }
}

//2- Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
fun ex2() {
    try {
        print("Escreva um número positivo ou negativo: ")
        val n1 = readLine()!!.toInt()

        if (n1 > 0) {
            println("O número $n1 positivo.")
        } else {
            println("O número $n1 é negativo.")
        }
    } catch (e: NumberFormatException) {
        println("Favor digitar um número positivo ou negativo.")
    }
}

/*3- Faça um programa que verifique (usando if e else) se uma letra digitada é “F” ou “M”. Conforme a letra escrever:
F – Feminino, M- Masculino, Sexo inválido. */
fun ex3() {
    print("Escreva o seu sexo: ")
    val s = readLine()

    if (s == "F") {                                //tentar usar when depois
        println("$s - Feminino.")
    } else if (s == "M") {
        println("$s - Masculino.")
    } else {
        println("Sexo inválido.")
    }
}

//4- Faça um programa que verifique (usando if e else) se uma letra digitada é vogal ou consoante.
fun ex4() {
    print("Escreva uma letra: ")

    val l = readLine()!!.lowercase()

    if (l == "a" || l == "e" || l == "i" || l == "o" || l == "u") {                  // Tentar usar when depois
        println("A letra $l é uma vogal.")
    } else if (l == "b" || l == "c" || l == "d" || l == "f" || l == "g" || l == "h" || l == "j" || l == "k" ||
        l == "l" || l == "m" || l == "n" || l == "p" || l == "q" || l == "r" || l == "s" || l == "t" || l == "v" ||
        l == "w" || l == "x" || l == "y" || l == "z"
    ) {
        println("A letra $l é uma consoante")
    } else {
        println("Favor inserir uma letra.")
    }
}

/*5- Faça um programa para a leitura de duas notas parciais de um aluno.
a)A mensagem “Aprovado”, se a média alcançada for maior ou igual a sete;
b)A mensagem “Aprovado com Distinção”, se a média for igual a dez;
c)A mensagem “Reprovado” se a média for menor de do que sete;*/
fun ex5() {
    try {
        print("Digite a primeira nota: ")
        val n1 = readLine()!!.toInt()
        print("Digita a segunda nota: ")
        val n2 = readLine()!!.toInt()

        if (((n1 + n2) / 2) >= 7) {
            println("Aprovado")
        } else if (((n1 + n2) / 2) == 10) {
            println("Aprovado com Distinção.")
        } else {
            println("Reprovado.")
        }
    } catch (e: NumberFormatException) {
        println("Favor digitar uma nota válida.")
    }
}

//6 - Faça um programa que leia três números, verifique (usando if e else), e mostre o maior deles.
fun ex6() {
    try {
        print("Escreva o primeiro número: ")
        val n1 = readLine()!!.toInt()
        print("Escreva o segundo número: ")
        val n2 = readLine()!!.toInt()
        print("Escreva o terceiro número: ")
        val n3 = readLine()!!.toInt()

        if ((n1 > n2) && (n1 > n3)) {
            println("O maior número é $n1.")
        } else if ((n2 > n1) && (n2 > n3)) {
            println("O maior número é $n2.")
        } else if ((n3 > n1) && (n3 > n2)) {
            println("O maior número é $n3.")
        }
    } catch (e: NumberFormatException) {
        println("Favor digitar um número.")
    }
}

//7- Faça um programa que leia três números, verifique (usando if e else) e mostre o maior e o menor deles;
fun ex7() {
    try {
        print("Escreva o primeiro número: ")
        val n1 = readLine()!!.toInt()
        print("Escreva o segundo número: ")
        val n2 = readLine()!!.toInt()
        print("Escreva o terceiro número: ")
        val n3 = readLine()!!.toInt()

        var maior = 0
        var menor = 0

        if ((n1 > n2) && (n1 > n3)) {
            maior = n1
        } else if ((n2 > n1) && (n2 > n3)) {
            maior = n2
        } else if ((n3 > n1) && (n3 > n2)) {
            maior = n3
        }

        if ((n1 < n2) && (n1 < n3)) {
            menor = n1
        } else if ((n2 < n1) && (n2 < n3)) {
            menor = n2
        } else if ((n3 < n1) && (n3 < n2)) {
            menor = n3
        }
        println("O maior número é $maior, e o menor número é $menor.")
    } catch (e: NumberFormatException) {
        println("Favor digitar um número.")
    }
}

/* 8- Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a
decisão é sempre o mais barato. */
fun ex8() {
    try {
        print("Digite o primeiro preço: ")
        val n1 = readLine()!!.toDouble()
        print("Digite o segundo preço: ")
        val n2 = readLine()!!.toDouble()
        print("Digite o terceiro preço: ")
        val n3 = readLine()!!.toDouble()
        var menor = 0.0

        if ((n1 < n2) && (n1 < n3)) {
            menor = n1
        } else if ((n2 < n1) && (n2 < n3)) {
            menor = n2
        } else if ((n3 < n1) && (n3 < n2)) {
            menor = n3
        }
        println("O menor preço é de R$ $menor.")
    } catch (e: NumberFormatException) {
        println("Favor digitar um preço válido.")
    }
}

//9- Faça um programa que leia três números e mostre-os em ordem decrescente.
fun ex9() {
    try {
        print("Digite o primeiro número: ")
        val a = readLine()!!.toInt()
        print("Digite o segundo número: ")
        val b = readLine()!!.toInt()
        print("Digite o terceiro número: ")
        val c = readLine()!!.toInt()

        if (((a < b) && (a < c)) && ((a < b) && (b < c)) && ((a < c) && (b < c))) {
            println("$c, $b, $a")
        } else if (((c > b) && (c > a)) && ((a > b) && (a < c)) && ((b < c) && (b < a))) {
            println("$c, $a, $b")
        } else if (((b > a) && (b > c)) && ((a < b) && (a > c)) && ((c < a) && (c < b))) {
            println("$b, $a, $c")
        } else if (((b > a) && (b > c)) && ((c < b) && (c > a)) && ((a < b) && (a < c))) {
            println("$b, $c, $a")
        } else if (((a > b) && (a > c)) && ((b < a) && (b > c)) && ((c < a) && (c < b))) {
            println("$a, $b, $c")
        } else if (((a > b) && (a > c)) && ((b < a) && (b < c)) && ((c < a) && (c > b))) {
            println("$a, $c, $b")
        }
    } catch (e: NumberFormatException) {
        println("Digite um número válido.")
    }
}

/* 10- Faça um programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-vespertino ou N-noturno.
Imprima a mensagem “Bom dia!” ou  “Boa Noite” ou “Valor inválido”, conforme o caso. */
fun ex10() {
    print("Escreva o turno em que você estuda: ")
    val t = readLine()

    if (t == "M") {                                //tentar usar when depois
        println("Bom dia!")
    } else if (t == "V") {
        println("Boa tarde!")
    } else if (t == "N") {
        println("Boa noite!")
    } else {
        println("Valor inválido!")
    }
}

/* 11- As organizações CSM resolveram dar um aumento de salário aos seus colaboradores e o contrataram para desenvolver
o programa que calculará os reajustes.

a. Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário
atual;
b. Salários até R$ 280,00 (incluindo): aumento de 20%;
c. Salários entre R$ 280,00 e R$700,00: aumento de 15%;
d. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
e. Salários de R$ 1500,00 em diante: aumento de 5%

Após o aumento ser realizado; informe na tela;

f. O salário antes do reajuste;
g. O percentual de aumento aplicado;
h. O valor do aumento;
i. O novo salário, após o aumento. */
fun ex11() {
    try {
        print("Digite o valor do seu salário: ")
        var sal = readLine()!!.toDouble()
        var salantes = 0.0
        var aumento = 0.0

        if (sal <= 280.0) {
            salantes = sal
            aumento = sal * 0.2
            sal += sal * 0.2
            println("O salário antes do reajuste era: R$ $salantes")
            println("O percentual de aumento aplicado foi de 20%. ")
            println("O valor aumentado no salário foi de: R$ $aumento")
            println("O novo salário após o aumento será de: R$ $sal")
        } else if (sal in 280.0..700.0) {
            salantes = sal
            aumento = sal * 0.15
            sal += sal * 0.15
            println("O salário antes do reajuste era: R$ $salantes")
            println("O percentual de aumento aplicado foi de 15%. ")
            println("O valor aumentado no salário foi de: R$ $aumento")
            println("O novo salário após o aumento será de: R$ $sal")
        } else if (sal in 700.0..1500.0) {
            salantes = sal
            aumento = sal * 0.10
            sal += sal * 0.10
            println("O salário antes do reajuste era: R$ $salantes")
            println("O percentual de aumento aplicado foi de 10%. ")
            println("O valor aumentado no salário foi de: R$ $aumento")
            println("O novo salário após o aumento será de: R$ $sal")
        } else {
            salantes = sal
            aumento = sal * 0.05
            sal += sal * 0.05
            println("O salário antes do reajuste era: R$ $salantes")
            println("O percentual de aumento aplicado foi de 5%. ")
            println("O valor aumentado no salário foi de: R$ $aumento")
            println("O novo salário após o aumento será de: R$ $sal")
        }
    } catch (e: NumberFormatException) {
        println("Favor digitar um salário válido!")
    }
}

/* 12- Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do imposto de Renda, que
depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do salário bruto,
mas não é descontado (é a empresa que deposita.)

O salário líquido corresponde ao salário bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora
e a quantidade de horas trabalhadas no mês.

a. Desconto do IR;
b. Salário Bruto ate R$900,00 (inclusive) – Isento;
c. Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;
d. Salario bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
e. Salário bruto acima de 2500 – Desconto de 20%.
Imprima na tela as informações, dispostas conforme o exemplo abaixo, no exemplo valor da hora é 5 e a quantidade de
horas é 220.

Salário bruto (5 * 220)           : R$   1100,00

( – ) IR (5%)                     : R$     55,00

( – ) INSS ( 10% )                 : R$     110,00

FGTS ( 11%)                       : R$     121,00

Total de descontos                 : R$     165,00

Salário Líquido                   : R$     935,00 */
fun ex12() {
    try {
        print("Digite o valor da sua hora trabalhada: ")
        val valorHora = readLine()!!.toDouble()
        print("Digite a quantidade de horas trabalhadas no mês: ")
        val hora = readLine()!!.toInt()
        var porcent = 0.0
        val salarioBruto = valorHora * hora
        val inss = salarioBruto * 0.1
        val fgts = salarioBruto * 0.11


        if (salarioBruto <= 900.0) {
            var ir = salarioBruto * porcent
            var totalDisc = ir + inss
            var salarioLiq = salarioBruto - totalDisc
            println("Salário bruto: ($valorHora * $hora): R$ $salarioBruto")
            println("IR: Isento")
            println("INSS (10%): R$ $inss")
            println("FGTS (11%): R$ $fgts")
            println("Total de descontos: R$ $totalDisc")
            println("Salário líquido: R$ $salarioLiq")
        } else if ((salarioBruto > 900.0) && (salarioBruto <= 1500.0)) {
            porcent = 0.05
            var ir = salarioBruto * porcent
            var totalDisc = ir + inss
            var salarioLiq = salarioBruto - totalDisc
            println("Salário bruto: ($valorHora * $hora): R$ $salarioBruto")
            println("IR (5%): R$ $ir")
            println("INSS (10%): R$ $inss")
            println("FGTS (11%): R$ $fgts")
            println("Total de descontos: R$ $totalDisc")
            println("Salário líquido: R$ $salarioLiq")
        } else if ((salarioBruto > 1500.0) && (salarioBruto <= 2500.0)) {
            porcent = 0.1
            var ir = salarioBruto * porcent
            var totalDisc = ir + inss
            var salarioLiq = salarioBruto - totalDisc
            println("Salário bruto: ($valorHora * $hora): R$ $salarioBruto")
            println("IR (10%): R$ $ir")
            println("INSS (10%): R$ $inss")
            println("FGTS (11%): R$ $fgts")
            println("Total de descontos: R$ $totalDisc")
            println("Salário líquido: R$ $salarioLiq")
        } else {
            porcent = 0.2
            var ir = salarioBruto * porcent
            var totalDisc = ir + inss
            var salarioLiq = salarioBruto - totalDisc
            println("Salário bruto: ($valorHora * $hora): R$ $salarioBruto")
            println("IR (20%): R$ $ir")
            println("INSS (10%): R$ $inss")
            println("FGTS (11%): R$ $fgts")
            println("Total de descontos: R$ $totalDisc")
            println("Salário líquido: R$ $salarioLiq")
        }
    } catch (e: NumberFormatException) {
        println("Digite um valor válido!")
    }
}
