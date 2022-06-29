package br.com.china.bibliotecas.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {
    public static void main(String[] args) {
        Integer idadeRef = Integer.valueOf(29); // autoboxing
        System.out.println(idadeRef.doubleValue()); // unboxing

        // Double dref = new Double(20.0);
        Double dref = Double.valueOf(20.0);
        System.out.println(dref);

        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef);

        Number nRef = Float.valueOf(29);
        System.out.println(nRef);


        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20.0);
        lista.add(10.5f);
    }
}
