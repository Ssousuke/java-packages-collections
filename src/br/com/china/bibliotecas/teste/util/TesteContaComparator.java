package br.com.china.bibliotecas.teste.util;

import br.com.china.bibliotecas.modelo.Conta;
import br.com.china.bibliotecas.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteContaComparator {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 25);
        cc1.deposita(200.0);

        Conta cc2 = new ContaCorrente(23, 11);
        cc2.deposita(250.0);

        Conta cc3 = new ContaCorrente(24, 26);
        cc3.deposita(300.0);

        List<Conta> contas = new ArrayList<Conta>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);

        for (Conta c : contas) {
            System.out.println(c);
        }

        NumeroDaContaComparator comparator = new NumeroDaContaComparator();
        contas.sort(comparator);
        System.out.println("x------------------------x");

        for (Conta c : contas) {
            System.out.println(c);
        }
    }
}

// Classe define as regras que serão aplicadas a ordenação
class NumeroDaContaComparator implements Comparator<Conta> {
    /**
     * @param conta1 primeiro objeto a ser comparado
     * @param conta2 segundo objeto a ser comparado
     * @return objetos por ordem do número da conta
     */
    @Override
    public int compare(Conta conta1, Conta conta2) {
        if (conta1.getNumero() < conta2.getNumero()) {
            return -1;
        }
        if (conta1.getNumero() > conta2.getNumero()) {
            return 1;
        }
        return 0;
    }
}
