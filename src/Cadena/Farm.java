/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadena;

/**
 *
 * @author dmadero
 */
import java.util.Date;
import java.text.DateFormat;
import java.util.ArrayList;

public class Farm {
    protected String name;
    protected ArrayList<ProductoC> productosc;

    public Farm(String name, ArrayList<ProductoC> productosc) {
        this.name = name;
        this.productosc = productosc;
    }
    
    
}
