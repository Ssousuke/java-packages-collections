package br.com.china.bibliotecas.teste.util;

import br.com.china.bibliotecas.modelo.Conta;
import br.com.china.bibliotecas.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {
    public static void main(String[] args) {
        List<Conta> list = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        list.add(cc);

        Conta cc2 = new ContaCorrente(23, 12);
        list.add(cc2);

        System.out.println(list);
        System.out.println("Tamanho: " + list.size());

        Conta ref = list.get(0);
        System.out.println(ref);

        list.remove(0);
        System.out.println("Tamanho: " + list.size());

        Conta cc3 = new ContaCorrente(24, 13);
        list.add(cc3);

        for (Conta i : list) {
            System.out.println(i);
        }
    }
}