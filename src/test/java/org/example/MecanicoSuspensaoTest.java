package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MecanicoSuspensaoTest {

    private MecanicoSuspensao mecanicoSuspensao;

    @BeforeEach
    public void setUp() {
        mecanicoSuspensao = new MecanicoSuspensao();
        mecanicoSuspensao.setId(2);
        mecanicoSuspensao.setNome("João");
    }

    @Test
    public void testCalcularValorTotal() {
        mecanicoSuspensao.setValorServico1(150.0f);
        mecanicoSuspensao.setValorServico2(150.0f);
        assertEquals(300.0f, mecanicoSuspensao.calcularValorTotal(), "O valor total do serviço deve ser 300.0");
    }

    @Test
    public void testVerificarSucessoServico_Sucesso() {
        mecanicoSuspensao.setValorServico1(200.0f);
        mecanicoSuspensao.setValorServico2(150.0f);
        assertEquals("Serviço bem-sucedido", mecanicoSuspensao.verificarSucessoServico(), "O serviço deve ser considerado bem-sucedido");
    }

    @Test
    public void testVerificarSucessoServico_Falha() {
        mecanicoSuspensao.setValorServico1(100.0f);
        mecanicoSuspensao.setValorServico2(150.0f);
        assertEquals("Serviço não-sucedido", mecanicoSuspensao.verificarSucessoServico(), "O serviço deve ser considerado não-sucedido");
    }

    @Test
    public void testGetTipo() {
        assertEquals("MecanicoSuspensao", mecanicoSuspensao.getTipo(), "O tipo do mecânico deve ser MecanicoSuspensao");
    }

    @Test
    public void testGetInfo() {
        mecanicoSuspensao.setValorServico1(200.0f);
        mecanicoSuspensao.setValorServico2(150.0f);
        String expectedInfo = "MecanicoSuspensao{id=2, nome='João', resultado=Serviço bem-sucedido}";
        assertEquals(expectedInfo, mecanicoSuspensao.getInfo(), "A informação do mecânico não corresponde ao esperado");
    }
}
