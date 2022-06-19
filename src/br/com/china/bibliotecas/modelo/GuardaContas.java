package br.com.china.bibliotecas.modelo;

public class GuardaContas {
    private Object[] fererencias;
    private int posicao;

    public GuardaContas() {
        this.fererencias = new Object[10];
        this.posicao = 0;
    }

    public void adiciona(Object ref) {
        this.fererencias[this.posicao] = ref;
        this.posicao++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicao;
    }

    public Object getReferenciaConta(int posicao) {
        return this.fererencias[posicao];
    }
}
