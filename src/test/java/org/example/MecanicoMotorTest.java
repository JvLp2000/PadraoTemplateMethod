package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MecanicoMotorTest {

    private MecanicoMotor mecanicoMotor;

    @BeforeEach
    public void setUp() {
        mecanicoMotor = new MecanicoMotor();
        mecanicoMotor.setId(1);
        mecanicoMotor.setNome("Carlos");
    }

    @Test
    public void testCalcularValorTotal() {
        mecanicoMotor.setValorServico1(200.0f);
        mecanicoMotor.setValorServico2(300.0f);
        assertEquals(500.0f, mecanicoMotor.calcularValorTotal(), "O valor total do serviço deve ser 500.0");
    }

    @Test
    public void testVerificarSucessoServico_Sucesso() {
        mecanicoMotor.setValorServico1(250.0f);
        mecanicoMotor.setValorServico2(300.0f);
        assertEquals("Serviço bem-sucedido", mecanicoMotor.verificarSucessoServico(), "O serviço deve ser considerado bem-sucedido");
    }

    @Test
    public void testVerificarSucessoServico_Falha() {
        mecanicoMotor.setValorServico1(200.0f);
        mecanicoMotor.setValorServico2(200.0f);
        assertEquals("Serviço não-sucedido", mecanicoMotor.verificarSucessoServico(), "O serviço deve ser considerado não-sucedido");
    }

    @Test
    public void testGetTipo() {
        assertEquals("MecanicoMotor", mecanicoMotor.getTipo(), "O tipo do mecânico deve ser MecanicoMotor");
    }

    @Test
    public void testGetInfo() {
        mecanicoMotor.setValorServico1(300.0f);
        mecanicoMotor.setValorServico2(300.0f);
        String expectedInfo = "MecanicoMotor{id=1, nome='Carlos', resultado=Serviço bem-sucedido}";
        assertEquals(expectedInfo, mecanicoMotor.getInfo(), "A informação do mecânico não corresponde ao esperado");
    }
}
