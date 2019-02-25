/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadena;

import java.util.ArrayList;

/**
 *
 * @author dmadero
 */
public class Manufactura {
    protected String nombre;
    protected ArrayList<ProductoM> productosC;

    public Manufactura(String nombre, ArrayList<ProductoM> productosC) {
        this.nombre = nombre;
        this.productosC = productosC;
    }
    
}
