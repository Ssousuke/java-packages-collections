package br.com.china.bibliotecas.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStream {
    public static void main(String[] args) throws IOException {
        PrintStream printStream = new PrintStream("java-io/src/loremIpsum.txt");
        printStream.println("Olá Mundo!");
        printStream.println();
        printStream.println();
        printStream.println("Fim!");
        printStream.close();
    }
}
