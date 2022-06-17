package br.com.china.bibliotecas.teste;

import br.com.china.bibliotecas.modelo.Conta;
import br.com.china.bibliotecas.modelo.ContaCorrente;
import br.com.china.bibliotecas.modelo.GuardaContas;

public class TesteGuardaContas {
    public static void main(String[] args) {
        GuardaContas guardaContas = new GuardaContas();

        Conta cc = new ContaCorrente(22, 10);
        guardaContas.adiciona(cc);

        Conta cc2 = new ContaCorrente(23, 12);
        guardaContas.adiciona(cc2);

        int tamanho = guardaContas.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardaContas.getReferenciaConta(1);
        System.out.println(ref.getNumero());
    }
}
