package com.company;

public class Produto implements IArtigo{

    private int codigoProduto;
    private String tituloProduto;
    private String descrArt;

    @Override
    public int getCodigoArt() {
        return codigoProduto;
    }

    @Override
    public String getTituloArt() {
        return tituloProduto;
    }

    @Override
    public String getDescrArt() {
        return descrArt;
    }

    @Override
    public void setCodigoArt(int cod) {
        this.codigoProduto = cod;
    }

    @Override
    public void setTituloArt(String titulo) {
        this.tituloProduto = titulo;
    }

    @Override
    public void setDescrArt(String descr) {
        this.descrArt = descr;
    }
}
