package br.com.china.bibliotecas.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintWriter {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter("java-io/src/loremIpsum.txt");
        printWriter.println("Olá Mundo!");
        printWriter.println();
        printWriter.println();
        printWriter.println("Fim!");
        printWriter.close();
    }
}
