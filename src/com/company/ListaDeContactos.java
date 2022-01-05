package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListaDeContactos
{
    private List<IContacto> contactos;
    public ListaDeContactos(){ this.contactos = new ArrayList<>(); }
    public List<IContacto> getContactos(){
        return contactos;
    }

    public void addContacto(IContacto contacto){
        this.contactos.add(contacto);
    }


    public void removeContacto(IContacto contacto){
       this.contactos.remove(contacto);
    }

}