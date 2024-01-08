package edu.ebac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author vinisantosn
 */
public class Main {
    public static void main(String[] args) {
        List<String> listaDeNomes = new ArrayList<>();

        //ADIÇÃO DE ELEMENTOS NA LISTA
        listaDeNomes.add("Maria");
        listaDeNomes.add("José");
        listaDeNomes.add("Ana");
        listaDeNomes.add("Carlos");


        System.out.println(listaDeNomes);
        // ORDENANDO A LISTA
        Collections.sort(listaDeNomes);
        System.out.println(listaDeNomes);
    }
}