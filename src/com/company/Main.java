package com.company;

import com.company.models.Impressora;
import com.company.models.ImpressoraCannon;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Impressora impressora = new ImpressoraCannon("xyz", "Wireless", 0, 0.2);

        System.out.println(impressora.imprimir());

        ArrayList<Impressora> listaImpressora = new ArrayList<>();



    }
}
