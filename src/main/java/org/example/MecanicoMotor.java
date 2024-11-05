package org.example;

public class MecanicoMotor extends Mecanico {

    @Override
    public String verificarSucessoServico() {
        if (this.calcularValorTotal() >= 500.0f) {
            return "Serviço bem-sucedido";
        }
        else {
            return "Serviço não-sucedido";
        }
    }

    @Override
    public String getTipo() {
        return "MecanicoMotor";
    }
}
