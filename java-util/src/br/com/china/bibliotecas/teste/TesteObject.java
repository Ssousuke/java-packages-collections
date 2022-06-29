package br.com.china.bibliotecas.teste;

import br.com.china.bibliotecas.modelo.ContaCorrente;
import br.com.china.bibliotecas.modelo.ContaPoupanca;

public class TesteObject {
    public static void main(String[] args) {
        Object cc = new ContaCorrente(22, 33);
        Object cp = new ContaPoupanca(33, 22);
        System.out.println(cc);
        System.out.println(cp);
    }

    static void println() {
    }

    static void println(int a) {
    }

    static void println(boolean valor) {
    }

    static void println(Object referencia) {
    }

}
