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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @authors Jhon Rodríguez, Diana Madero, Kevin Jiménez
 */

public class GestionInfo {
    
    private String direccion;

    public GestionInfo(String direccion) {
        this.direccion = direccion;
    }

    
    public boolean guardar(ArrayList<ProductoR> productos) throws IOException{
        File archivo = new File(this.direccion);
        if(!archivo.exists())
            archivo.createNewFile();
        
        PrintStream salida = 
               new PrintStream(archivo);
        
        return true;
    }
}
    