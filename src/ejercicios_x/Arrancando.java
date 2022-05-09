/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_x;

/**
 *Clase Arrancando
 * @author Aarón Míguez
 */
public class Arrancando implements Estado{
    /**
     * Siguiente estado de Arrancando
     * @return En_Marcha
     */
    public Estado siguiente(){
        return new En_Marcha();
    }
}
