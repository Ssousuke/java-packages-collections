package br.com.china.bibliotecas.strings;

import java.lang.*;

/**
 * @author Wesley Farias
 */
public class TesteString {
    public static void main(String[] args) {
        // Operações com Strings
        // A classe String foi feita de tal forma que
        // valores atribuitos a String são imutaveis!
        String name = "China";
        System.out.println(name);

        String nameReplace = name.replace("i", "1");
        System.out.println(nameReplace);

        String nameUpperCase = name.toUpperCase();
        System.out.println(nameUpperCase);

        String nameLowerCase = name.toLowerCase();
        System.out.println(nameLowerCase);

        // Buscando caractere pela posição
        char position = name.charAt(3);
        System.out.println(position);

        // Buscando caractere pelo conteúdo
        int positionChar = name.indexOf("ch");
        System.out.println(positionChar);

        // Criando uma subString
        String newString = name.substring(2, 5);
        System.out.println(newString);
        System.out.println(newString.length());

        // .isEmpty() : Verifica se a variável está vazia
        // false
        String isVariableIsEmpty = " ";
        System.out.println(isVariableIsEmpty.isEmpty());

        // .trim() : remove os espaços em branco das variáveis
        // true
        String newVariableIsEmpty = isVariableIsEmpty.trim();
        System.out.println(newVariableIsEmpty.isEmpty());

        // .contains() : verifica se dentro de uma string contem o valor
        // que está sendo passado dentro do método
        String dog1 = "Alex";
        String dog2 = "China";
        String dog3 = "Batman";
        String dog4 = "Batman";

        System.out.println(dog1.contains(dog2));
        System.out.println(dog1.contains(dog3));
        System.out.println(dog3.contains(dog4));
        System.out.println(dog1.contains("Ale"));
    }
}
