package com.cafeteriauam.modelos;

import java.util.ArrayList;

public class Pedido {
    private String estado;
    private ArrayList<Producto> productos;

    public Pedido() {
        productos = new ArrayList<>();
        estado = "Pendiente";
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);

    }

    public void cambiarEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public double calcularTotal(){
        double total = 0;

        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public String mostrarPedido() {
        StringBuilder sb = new StringBuilder();
        String detalle = "------DETALLE DEL PEDIDO------\n";

        for (Producto producto : productos){
            detalle += producto.mostrarInformacion() + "\n";
        }
        sb.append("---------------------------").append("\n");
        sb.append("Estado: ").append(estado).append("\n");
        sb.append("Productos:\n");
        for (Producto producto : productos) {
            sb.append("- ").append(producto.getNombre()).append(": $").append(producto.getPrecio()).append("\n");
        }
        sb.append("Total: $").append(calcularTotal());
        return sb.toString();
    }

}
