package com.company;

public class Main {

    public static void main(String[] args) {

        ListaDeClientes listaDeClientes = new ListaDeClientes();

        Cliente cliente1 = new Cliente("Domingos", "121321321");
        Cliente cliente2 = new Cliente("Goncalo", "1123431242");
        Cliente cliente3 = new Cliente("Andre", "1213123121321");
        Cliente cliente4 = new Cliente("Ruben", "245465");
        Cliente cliente5 = new Cliente("Luis", "1213456323454321321");

        listaDeClientes.addCliente(cliente1);
        listaDeClientes.addCliente(cliente2);
        listaDeClientes.addCliente(cliente3);
        listaDeClientes.addCliente(cliente4);
        listaDeClientes.addCliente(cliente5);

        try {
            listaDeClientes.addClienteWithException(cliente1);
            listaDeClientes.addClienteWithException(cliente2);
            listaDeClientes.addClienteWithException(cliente3);
            listaDeClientes.addClienteWithException(cliente4);
            listaDeClientes.addClienteWithException(cliente5);
        } catch (ExistException e) {
            e.printStackTrace();
        }

        for (Cliente c : listaDeClientes.getClientes()) {
            System.out.println("cliente :" +c.getNome() + " com o nif: "+ c.getNif());
        }

        ListaDeContactos listaDeContactos = new ListaDeContactos();
        listaDeContactos.addContacto(cliente1);
        listaDeContactos.addContacto(cliente2);
        listaDeContactos.addContacto(cliente3);
        listaDeContactos.addContacto(cliente4);
        listaDeContactos.addContacto(cliente5);
        for (IContacto c : listaDeContactos.getContactos()) {
            System.out.println("cliente :" +c.getNome() + " com o telf: " + c.getTelefone());
        }
    }
}
