package org.example;

public class MecanicoSuspensao extends Mecanico {

    @Override
    public String verificarSucessoServico() {
        if (this.calcularValorTotal() >= 300.0f) {
            return "Serviço bem-sucedido";
        }
        else {
            return "Serviço não-sucedido";
        }
    }

    @Override
    public String getTipo() {
        return "MecanicoSuspensao";
    }
}

