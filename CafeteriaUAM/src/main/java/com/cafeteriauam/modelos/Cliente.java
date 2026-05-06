package com.cafeteriauam.modelos;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;

public class Cliente {
    private String nombre;

    public Cliente() {
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void hacerPedido(){
        JOptionPane.showMessageDialog(null, nombre + " esta realizando un pedido");

    }

    public void recibirNotificacion(String mensaje){
        JOptionPane.showMessageDialog(null, nombre + " ha recibido una notificación: " + mensaje);
    }
}
