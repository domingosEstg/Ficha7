package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListaDeClientes
{
    private List<Cliente> clientes;
    public ListaDeClientes(){ this.clientes = new ArrayList<>(); }
    public List<Cliente> getClientes(){
        return clientes;
    }
    public void addCliente(Cliente cliente){
        for (Cliente c : clientes) {
            if(c.getNif().equals(cliente.getNif())){
                System.out.println("Nif repetido ,nao e possivel adicionar o cliente");
                return;
            }
        }
        this.clientes.add(cliente);
    }

    public void addClienteWithException(Cliente cliente) throws ExistException{
        for (Cliente c : clientes) {
            if(c.getNif().equals(cliente.getNif())){
                throw new ExistException("Cliente com este nif ja existe");
            }
        }
        this.clientes.add(cliente);
    }
}