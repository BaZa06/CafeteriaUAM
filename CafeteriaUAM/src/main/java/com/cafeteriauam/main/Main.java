package com.cafeteriauam.main;

import com.cafeteriauam.modelos.Cliente;
import com.cafeteriauam.modelos.Pedido;
import com.cafeteriauam.modelos.Producto;
import com.cafeteriauam.modelos.Cocina;
import com.cafeteriauam.modelos.Cajero;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Cliente1");
        Cajero cajero = new Cajero();
        Cocina cocina = new Cocina();

        cajero.recibirPedido(cliente);


        Pedido pedido = cajero.crearPedido();

        int opcion;

        do {

            String menu = "===== MENÚ DE CAFETERÍA =====\n"
                    + "1. Café - $2.50\n"
                    + "2. Capuccino - $3.00\n"
                    + "3. Sandwich - $4.50\n"
                    + "4. Pastel - $2.00\n"
                    + "5. Finalizar pedido\n\n"
                    + "Seleccione una opción:";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {

                case 1:
                    pedido.agregarProducto(new Producto("Café", 2.50));
                    JOptionPane.showMessageDialog(null,
                            "Café agregado al pedido.");
                    break;

                case 2:
                    pedido.agregarProducto(new Producto("Capuccino", 3.00));
                    JOptionPane.showMessageDialog(null,
                            "Capuccino agregado al pedido.");
                    break;

                case 3:
                    pedido.agregarProducto(new Producto("Sandwich", 4.50));
                    JOptionPane.showMessageDialog(null,
                            "Sandwich agregado al pedido.");
                    break;

                case 4:
                    pedido.agregarProducto(new Producto("Pastel", 2.00));
                    JOptionPane.showMessageDialog(null,
                            "Pastel agregado al pedido.");
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null,
                            "Pedido finalizado.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null,
                            "Opción inválida.");
            }

        } while (opcion != 5);

        JOptionPane.showMessageDialog(null,
                pedido.mostrarPedido());

        cajero.enviarPedidoACocina(pedido, cocina);

        cajero.notificarCliente(cliente, pedido);
    }
}