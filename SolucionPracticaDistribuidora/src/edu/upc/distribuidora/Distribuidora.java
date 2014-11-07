/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.distribuidora;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josediaz
 */
public class Distribuidora {
    
    private List<Factura> facturas;
    /*
    Implementar un programa en java que me permita almacenar N facturas,
    me permita listar las facturas que existen (sólo su número de factura) y
    otro que me reciba el número de factura y lo imprima en pantalla.
    */
    public Distribuidora(){
        facturas = new ArrayList<>();
    }
    
    public void guardarFactura(Factura factura){
        facturas.add(factura);
    }
    public void guardarFactura(List<Factura> facturas){
        for(Factura obj: facturas){
            this.facturas.add(obj);
        }
    }
    
    public void listarFacturas(){
        for(Factura obj: facturas){
            System.out.println("Factura Nro " + obj.getNumeroFactura());
        }
    }
    
    public void imprimirFactura(String numeroFactura){
        Factura factura = buscarFactura(numeroFactura);
        if(factura!=null){
            System.out.println("Factura " + factura);
        }
    }

    private Factura buscarFactura(String numeroFactura) {
            
        for(Factura obj: facturas){
            if(obj.getNumeroFactura().equals(numeroFactura)){
                return obj;
            }
        }
        
        return null;
    }
}
