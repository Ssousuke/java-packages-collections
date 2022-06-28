package br.com.china.bibliotecas.teste.util;

import br.com.china.bibliotecas.modelo.Cliente;
import br.com.china.bibliotecas.modelo.Conta;
import br.com.china.bibliotecas.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 25);
        Cliente clienteCc1 = new Cliente();
        clienteCc1.setNome("Wesley");
        cc1.setTitular(clienteCc1);
        cc1.deposita(250.0);

        Conta cc2 = new ContaCorrente(23, 11);
        Cliente clienteCc2 = new Cliente();
        clienteCc2.setNome("Matheus");
        cc2.setTitular(clienteCc2);
        cc2.deposita(200.0);

        Conta cc3 = new ContaCorrente(24, 26);
        Cliente clienteCc3 = new Cliente();
        clienteCc3.setNome("Fernanda");
        cc3.setTitular(clienteCc3);
        cc3.deposita(300.0);

        List<Conta> contas = new ArrayList<Conta>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);

        // Lambda
        contas.sort((conta1, conta2) -> Integer.compare(conta1.getNumero(), conta2.getNumero()));

        // Classe anônima
        Comparator<Conta> comp = (Conta conta1, Conta conta2) -> {
            String nomeC1 = conta1.getTitular().getNome();
            String nomeC2 = conta2.getTitular().getNome();
            return nomeC1.compareTo(nomeC2);
        };
        // contas.sort(comp);

        // Para a lista de contas faça um forEach
        // Para cada elemento imprima
        contas.forEach((conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()));
    }
}