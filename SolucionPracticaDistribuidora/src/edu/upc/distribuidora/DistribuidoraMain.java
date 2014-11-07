/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.distribuidora;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author josediaz
 */
public class DistribuidoraMain {
 
    public static void main(String[] args) {
        
        Factura factura1 = new Factura("GMD", "27456544321", new Date(), "001");
        
        List<DetalleFactura> items1 = new ArrayList<>();
        DetalleFactura detalle1 = new DetalleFactura(2, "Vacantes al curso Spring", 2000.00, factura1);
        items1.add(detalle1);
        
        factura1.setItems(items1);
        
        
        
        Factura factura2 = new Factura("PECSA", "2051456415", new Date(), "002");
        
        List<DetalleFactura> items2 = new ArrayList<>();
        
        DetalleFactura detalle2 = new DetalleFactura(1, "Desarrollo de producto de fidelizacion",
                20000.00, factura2);
        items2.add(detalle2);
        factura2.setItems(items2);
        
        
        Distribuidora distribuidora = new Distribuidora();
        distribuidora.guardarFactura(factura1);
        distribuidora.guardarFactura(factura2);
        
        distribuidora.listarFacturas();
        
        distribuidora.imprimirFactura(factura1.getNumeroFactura());
        
    }
    
}
