package br.com.china.bibliotecas.modelo;

public class GuardaContas {
    private Conta[] fererencias;
    private int posicao;

    public GuardaContas() {
        this.fererencias = new Conta[10];
        this.posicao = 0;
    }

    public void adiciona(Conta ref) {
        this.fererencias[this.posicao] = ref;
        this.posicao++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicao;
    }

    public Conta getReferenciaConta(int posicao) {
        return this.fererencias[posicao];
    }
}
