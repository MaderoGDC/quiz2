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
public abstract class ProductoM extends ProductoC {
    protected String nombreM;
    protected Date fechaM;
    protected int Lote;
    protected String distibuidora;

    public ProductoM(String nombreM, Date fechaM, int Lote, String distibuidora, String nombreC, Date fechaC, String manufactura) {
        super(nombreC, fechaC, manufactura);
        this.nombreM = nombreM;
        this.fechaM = fechaM;
        this.Lote = Lote;
        this.distibuidora = distibuidora;
    }

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public Date getFechaM() {
        return fechaM;
    }

    public void setFechaM(Date fechaM) {
        this.fechaM = fechaM;
    }

    public int getLote() {
        return Lote;
    }

    public void setLote(int Lote) {
        this.Lote = Lote;
    }

    public String getDistibuidora() {
        return distibuidora;
    }

    public void setDistibuidora(String distibuidora) {
        this.distibuidora = distibuidora;
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
