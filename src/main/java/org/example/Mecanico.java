package org.example;

public abstract class Mecanico {

    private int id;
    protected String nome;
    private float valorServico1;
    private float valorServico2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorServico1() {
        return valorServico1;
    }

    public void setValorServico1(float valorServico1) {
        this.valorServico1 = valorServico1;
    }

    public float getValorServico2() {
        return valorServico2;
    }

    public void setValorServico2(float valorServico2) {
        this.valorServico2 = valorServico2;
    }

    public float calcularValorTotal() {
        return this.valorServico1 + this.valorServico2;
    }

    public abstract String verificarSucessoServico();

    public String getTipo() {
        return "Mecanico";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarSucessoServico() +
                '}';
    }
}
