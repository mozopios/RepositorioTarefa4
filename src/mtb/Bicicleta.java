/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mtb;

/**
 * Clase Bicicleta
 * Extiende de la superclase RefactorizarSuperclass
 * @author Aarón Míguez
 */
public class Bicicleta extends RefactorizarSuperclass {
    /**
     * cadencia de Bicicleta
     */
    public int cadencia;
    /**
     * Constructor por defecto
     * @param cadenciaIni
     * @param velocidadIni extiende de RefactorizarSuperclass
     */
    public Bicicleta(int cadenciaIni, int velocidadIni)
    {
        cadencia = cadenciaIni;
        velocidad = velocidadIni;
    }
    
    /**
     * 
     * @param nuevoValor para establecer la cadencia
     */
    public void setCadencia(int nuevoValor) { //establecer cadencia
        cadencia = nuevoValor;
    }


    /**
     * 
     * @return la cadencia
     */
    public int getCadencia()
    {
        return cadencia;
    }


}
