package br.com.china.bibliotecas.teste.util;

import br.com.china.bibliotecas.modelo.Cliente;
import br.com.china.bibliotecas.modelo.Conta;
import br.com.china.bibliotecas.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteContaComparator {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 25);
        Cliente clienteCc1 = new Cliente();
        clienteCc1.setNome("Wesley");
        cc1.setTitular(clienteCc1);
        cc1.deposita(200.0);

        Conta cc2 = new ContaCorrente(23, 11);
        Cliente clienteCc2 = new Cliente();
        clienteCc2.setNome("Matheus");
        cc2.setTitular(clienteCc2);
        cc2.deposita(250.0);

        Conta cc3 = new ContaCorrente(24, 26);
        Cliente clienteCc3 = new Cliente();
        clienteCc3.setNome("Fernanda");
        cc3.setTitular(clienteCc3);
        cc3.deposita(300.0);

        List<Conta> contas = new ArrayList<Conta>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        System.out.println("#### Não ordernado ####");
        for (Conta c : contas) {
            System.out.println(c + ", " + c.getTitular().getNome());

        }

        // NumeroDaContaComparator comparator = new NumeroDaContaComparator();
        TitularDaContaComparator comparator = new TitularDaContaComparator();
        contas.sort(comparator);
        System.out.println("#### Ordernado ####");

        for (Conta c : contas) {
            System.out.println(c + ", " + c.getTitular().getNome());
        }
    }
}

class TitularDaContaComparator implements Comparator<Conta> {
    /**
     * @param conta1 recebe o nome do titular
     * @param conta2 recebe o nome do titular
     * @return conta1 é igual ou diferente a conta2
     */
    @Override
    public int compare(Conta conta1, Conta conta2) {
        String nomeC1 = conta1.getTitular().getNome();
        String nomeC2 = conta2.getTitular().getNome();
        return nomeC1.compareTo(nomeC2);
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
