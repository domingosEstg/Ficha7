package com.company;

import java.util.Set;

public class Cliente implements IContacto

{
    private String nome; // nome do cliente
    private String nif; // numero de identificação fiscal
    private Set<IArtigo> artigos; // lista de artigos
    private String tel;
    public Cliente(){ }

    public Cliente(String nome, String nif) {
        this.nome = nome;
        this.nif = nif;
    }

    public String getNome(){
        return nome;
    }
    public void setTelefone(String tel) {
        this.tel = tel;
    }

    public String getTelefone() {
        return tel;
    }

    public String getNif(){
        return nif;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNif(String nif){
        this.nif = nif;
    }
    public boolean adicionaArtigo(IArtigo artigo){
        return artigos.add(artigo);
    }
    public int getQtdArtigos(){
        return artigos.size();
    }
    public Set<IArtigo> getArtigos(){
        return artigos;
    }
}
