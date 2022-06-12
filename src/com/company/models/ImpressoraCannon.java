package com.company.models;

public class ImpressoraCannon extends Impressora{

    public ImpressoraCannon(String modelo, String tipoConexao, int folhasDisponiveis, double porcentagemTinta) {
        super(modelo, tipoConexao, folhasDisponiveis, porcentagemTinta);
    }

    @Override
    public boolean precisaTinta(){
        if(super.getPorcentagemTinta() >= 0.2){
            return false;
        }
        return true;
    }

    @Override
    public String imprimir(){
        if(!this.precisaTinta() && super.temPapel()){
            super.tiraPapel();
            super.tiraTinta(0.2);
            return "Imprimindo!";
        } else if (this.precisaTinta()){
            return "Falta tinta!";
        }
        return "Falta papel";
    }

    public String ligar(){
        return "Estou Ligando!";
    }
}
