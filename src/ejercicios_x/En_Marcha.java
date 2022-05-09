/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_x;

/**
 * Clase En_Marcha
 * @author Aarón Míguez
 */
public class En_Marcha implements Estado {
    /**
     * Siguiente estado de En_Marcha
     * @return Parando
     */
    public Estado siguiente(){
        return new Parando();
    }
}
