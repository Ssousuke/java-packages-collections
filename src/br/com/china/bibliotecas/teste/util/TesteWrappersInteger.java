package br.com.china.bibliotecas.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappersInteger {
    public static void main(String[] args) {
        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 29;

        // Integer idadeRef = new Integer(29);
        Integer idadeRef = Integer.valueOf(29);
        int valor = idadeRef.intValue();
        System.out.println(valor);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29);

        String s = args[0];

        //Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);
        System.out.println(numero);


        System.out.println("Valor Máximo: " + Integer.MAX_VALUE);
        System.out.println("Valor Mínimo: " + Integer.MIN_VALUE);
        System.out.println("Tamanho: " + Integer.SIZE);
        System.out.println("Bytes: " + Integer.BYTES);
        System.out.println("Tipo Primitivo: " + Integer.TYPE);
    }
}
