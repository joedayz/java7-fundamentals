/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.distribuidora;

/**
 *
 * @author josediaz
 */
public class DetalleFactura {
    
    private int cantidad;
    private String descripcionProducto;
    private double precio;
    private Factura factura;

    public DetalleFactura(int cantidad, String descripcionProducto,
            double precio, Factura factura) {
        this.cantidad = cantidad;
        this.descripcionProducto = descripcionProducto;
        this.precio = precio;
        this.factura = factura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    
    
    @Override
    public String toString() {
        return "DetalleFactura{" + "cantidad=" + cantidad + ", "
                + "descripcionProducto=" + descripcionProducto + ", "
                + "precio=" + precio + ", "
                + "factura=" + factura.getNumeroFactura() + '}';
    }
     
   
}
