package br.com.china.bibliotecas.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("java-io/src/contas.csv"));
        // boolean existeLinha = sc.hasNextLine();
        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            System.out.println(linha);
            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");
            String valor1 = linhaScanner.next();
            int valor2 = linhaScanner.nextInt();
            int valor3 = linhaScanner.nextInt();
            String valor4 = linhaScanner.next();
            double valor5 = linhaScanner.nextDouble();
            System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
            // String[] valores = linha.split(",");
            // System.out.println(Arrays.toString(valores));
            // System.out.println(valores[3]);
        }
        sc.close();
    }
}
