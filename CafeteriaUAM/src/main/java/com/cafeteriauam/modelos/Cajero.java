package com.cafeteriauam.modelos;


import javax.swing.*;

public class Cajero {
    private String nombre;
    private int counter = 0;

    public Cajero() {
    }

    public Cajero(int counter, String nombre) {
        this.counter = counter;
        this.nombre = nombre;
    }

    public  Pedido crearPedido() {
        Pedido pedido = new Pedido();
        JOptionPane.showMessageDialog(null, nombre + " está intentando crear un nuevo pedido");
        return pedido;
    }

    public void enviarPedidoACocina(Pedido pedido, Cocina cocina) {

        JOptionPane.showMessageDialog(null,
                nombre + " envió el pedido a cocina.");

        cocina.prepararPedido(pedido);
    }

    public void recibirPedido(Cliente cliente ){
        JOptionPane.showMessageDialog(null, nombre + " ha recibido el pedido de " + cliente.getNombre());

    }

    public void notificarCliente(Cliente cliente, Pedido pedido) {
        cliente.recibirNotificacion( "Su pedido ha sido recibido en cocina... \n" + pedido.mostrarPedido());
    }
}
