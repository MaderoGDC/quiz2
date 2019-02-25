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
public abstract class ProductoC{
    protected String nombreC;
    protected Date fechaC;
    protected String manufactura;

    public ProductoC(String nombreC, Date fechaC, String manufactura) {
        this.nombreC = nombreC;
        this.fechaC = fechaC;
        this.manufactura = manufactura;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public Date getFechaC() {
        return fechaC;
    }

    public void setFechaC(Date fechaC) {
        this.fechaC = fechaC;
    }

    public String getManufactura() {
        return manufactura;
    }

    public void setManufactura(String manufactura) {
        this.manufactura = manufactura;
    }
    


}
