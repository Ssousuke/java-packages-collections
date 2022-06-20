package br.com.china.bibliotecas.teste.util;

import java.util.ArrayList;

import br.com.china.bibliotecas.modelo.Conta;
import br.com.china.bibliotecas.modelo.ContaCorrente;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        ArrayList<Conta> list = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(23, 11);
        list.add(cc);

        Conta cc2 = new ContaCorrente(23, 11);
        list.add(cc2);

        System.out.println(list);
        System.out.println("Tamanho: " + list.size());

        Conta ref = list.get(0);
        System.out.println(ref);

        list.remove(0);
        System.out.println("Tamanho: " + list.size());

        Conta cc3 = new ContaCorrente(24, 13);
        list.add(cc3);

        boolean listContains = list.contains(cc2);
        System.out.println("Contém: " + listContains);

        for (Conta i : list) {
            System.out.println(i);
        }
    }
}