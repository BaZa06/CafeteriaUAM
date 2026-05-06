package com.cafeteriauam.modelos;

import javax.swing.JOptionPane;

public class Cocina {

    public void prepararPedido(Pedido pedido) {

        pedido.cambiarEstado("En proceso...");

        JOptionPane.showMessageDialog(
                null,
                "La cocina está preparando tu pedido.\n"
                        + "Estado actual: " + pedido.getEstado()
        );

        pedido.cambiarEstado("Su pedido está listo :3");

        JOptionPane.showMessageDialog(
                null,
                "La cocina terminó de preparar el pedido.\n"
                        + "Estado actual: " + pedido.getEstado()
        );
    }
}