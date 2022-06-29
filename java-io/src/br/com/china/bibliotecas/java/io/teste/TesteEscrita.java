package br.com.china.bibliotecas.java.io.teste;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        // Fluxo de escrita em arquivo
        OutputStream fileInputStream = new FileOutputStream("java-io/src/loremIpsum.txt");
        Writer writer = new OutputStreamWriter(fileInputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.newLine();
        bufferedWriter.write("Fim!");
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
