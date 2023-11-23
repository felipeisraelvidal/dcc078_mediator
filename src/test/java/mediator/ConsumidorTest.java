package mediator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsumidorTest {
    @Test
    void deveElogiarEstabelecimento() {
        Consumidor consumidor = new Consumidor();
        assertEquals("O Site agradece seu contato.\nO Estabelecimento respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Estabelecimento agradece a mensagem: Ótimo atendimento",
                consumidor.elogiarEstabelecimento("Ótimo atendimento"));
    }

    @Test
    void deveReclamarEstabelecimento() {
        Consumidor consumidor = new Consumidor();
        assertEquals("O Site agradece seu contato.\nO Estabelecimento respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Estabelecimento vai procurar melhorar o serviço da reclamação: Lentidão no atendimento",
                consumidor.reclamarEstabelecimento("Lentidão no atendimento"));
    }

    @Test
    void deveSugerirEstabelecimento() {
        Consumidor consumidor = new Consumidor();
        assertEquals("O Site agradece seu contato.\nO Estabelecimento respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Estabelecimento vai analisar a sugestão: Ampliar horário funcionamento",
                consumidor.sugerirEstabelecimento("Ampliar horário funcionamento"));
    }
}
