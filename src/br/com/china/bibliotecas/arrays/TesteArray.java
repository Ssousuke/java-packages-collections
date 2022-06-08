package br.com.china.bibliotecas.arrays;

public class TesteArray {
    public static void main(String[] args) {
        int[] ages = new int[5];
        ages[0] = 1;
        ages[1] = 2;
        ages[2] = 3;
        ages[3] = 4;
        ages[4] = 5;

        System.out.println("Length: " + ages.length);
        for (int i : ages) {
            System.out.printf("%d\n", i);
        }
    }
}
