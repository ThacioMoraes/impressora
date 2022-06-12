package com.company.models;

public class ImpressoraEpson extends Impressora {

    public ImpressoraEpson(String modelo, String tipoConexao, int folhasDisponiveis, double porcentagemTinta) {
        super(modelo, tipoConexao, folhasDisponiveis, porcentagemTinta);
    }

    @Override
    public String imprimir(){
        if(!super.precisaTinta() && super.temPapel()){
            super.tiraPapel();
            super.tiraTinta(0.1);
            return "Imprimindo!";
        } else if (super.precisaTinta()){
            return "Falta tinta!";
        }
        return "Falta papel";
    }
}
