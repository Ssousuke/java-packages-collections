package br.com.china.bibliotecas.java.io.teste;


import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        // Fluxo de entrada com arquivo
        InputStream fileInputStream = new FileInputStream("java-io/src/loremIpsum.txt");
        Reader reader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String linha = bufferedReader.readLine();
        while (linha != null) {
            System.out.println(linha);
            linha = bufferedReader.readLine();

        }
        bufferedReader.close();
    }
}