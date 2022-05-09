/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_x;

/**
 *Clase Parado
 * @author Aarón Míguez
 */
public class Parado implements Estado{
    /**
     * Siguiente estado de Parado 
     * @return Arrancando
     */
    public Estado siguiente(){
        return new Arrancando();
    }
}
