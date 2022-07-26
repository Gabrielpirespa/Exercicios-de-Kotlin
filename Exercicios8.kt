import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    @DisplayName("Testa os cenarios da portaria")
    fun testePortaria(){
        Assertions.assertAll(
            //Testa o primeiro if (se é maior que 18 anos)
            {Assertions.assertEquals(portaria(15,"",""),"Negado.")},
            {Assertions.assertEquals(portaria(20,"",""),"Negado.")},
            //Testa o segundo if (se é diferente de vazio o tpConvite)
            {Assertions.assertEquals(portaria(20,"VIP",""),"Negado.")},
            //Testa as três condições para ser aprovada a entrada, com os retornos possíveis para o tipo comum
            {Assertions.assertEquals(portaria(20,"comum","xt45689"),"Welcome.")},
            {Assertions.assertEquals(portaria(20,"comum","45689"),"Negado.")},
            //Testa as três condições para ser aprovada a entrada, com os retornos possíveis para o tipo premium
            {Assertions.assertEquals(portaria(20,"luxo","xl45689"),"Welcome.")},
            {Assertions.assertEquals(portaria(20,"luxo","xt45689"),"Negado.")},
            {Assertions.assertEquals(portaria(20,"luxo","45689"),"Negado.")},
            //Testa as três condições para ser aprovada a entrada, com os retornos possíveis para o tipo luxo
            {Assertions.assertEquals(portaria(20,"luxo","xl45689"),"Welcome.")},
            {Assertions.assertEquals(portaria(20,"luxo","xt45689"),"Negado.")},
            {Assertions.assertEquals(portaria(20,"luxo","45689"),"Negado.")}
        )
    }
}