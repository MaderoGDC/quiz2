/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadena;

import java.util.Date;

/**
 *
 * @author dmadero
 */
public abstract class ProductoR extends ProductoM{
    protected double precio;
    protected int codigo_v;

    public ProductoR(double precio, int codigo_v, String nombreM, Date fechaM, int Lote, String distibuidora, String nombreC, Date fechaC, String manufactura) {
        super(nombreM, fechaM, Lote, distibuidora, nombreC, fechaC, manufactura);
        this.precio = precio;
        this.codigo_v = codigo_v;
    }

    
    
    
}
