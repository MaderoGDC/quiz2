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
public abstract class producto {
   protected String name;
   protected Date fecha;

    public producto(String name, Date fecha) {
        this.name = name;
        this.fecha = fecha;
    }
}

