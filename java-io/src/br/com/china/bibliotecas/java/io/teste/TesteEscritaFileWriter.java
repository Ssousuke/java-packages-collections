package br.com.china.bibliotecas.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("java-io/src/loremIpsum.txt");
        fw.write("Olá Mundo!");
        fw.write(System.lineSeparator());
        fw.write("Fim!");
        fw.close();
    }
}
