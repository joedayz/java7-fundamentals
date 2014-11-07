/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.distribuidora;

import java.util.Date;
import java.util.List;

/**
 *
 * @author josediaz
 */
public class Factura {
    
    private String razonSocial;
    private String ruc;
    private Date fecha;
    private String numeroFactura;
    private List<DetalleFactura> items;
    private double subTotal;
    private final double IGV = 0.18;
    private double total;

    public Factura(String razonSocial, String ruc, Date fecha, String numeroFactura) {
        this.razonSocial = razonSocial;
        this.ruc = ruc;
        this.fecha = fecha;
        this.numeroFactura = numeroFactura;
        
        
        
    }

    public void setItems(List<DetalleFactura> items) {
        this.items = items;
        this.subTotal = sumaItems();
        this.total =  subTotal*(1.0 + IGV);
    }
    
    private double sumaItems() {
        double suma = 0.0;
        for(DetalleFactura obj: items){
            suma += obj.getCantidad() * obj.getPrecio();
        }
        return suma;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    @Override
    public String toString() {
        return "Factura{" + "razonSocial=" + razonSocial + ", ruc=" + ruc + ", fecha=" + fecha + ", numeroFactura=" + numeroFactura + ", items=" + items + ", subTotal=" + subTotal + ", IGV=" + IGV + ", total=" + total + '}';
    }

   


   
    
    
    
}
