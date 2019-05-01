/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ubkit
 */
import java.util.Scanner;

public class Sequencia_Vetor {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long[] array = new long[10];
        int posicao = array.length;
        for (int cont = 0; cont < array.length; cont++) {
            double nrandom = Math.random() * 9 + 1;
            array[cont] = Math.round(nrandom);
            if (cont == 0) {
                System.out.println(array[cont]);
            } else {
                posicao--;
                for (int p = 0; p < (array.length - posicao); p++) {
                    if (array[p] == array[cont]) {
                        while (array[p] == array[cont]) {
                            double sorteio = Math.random() * 9 + 1;
                            array[cont] = Math.round(sorteio);
                        }
                        p = 0;
                    }
                }
                System.out.println(array[cont]);

            }
        }

    }
}
