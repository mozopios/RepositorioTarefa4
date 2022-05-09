/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_x;

/**
 *Clase Parando
 * @author Aarón Míguez
 */
public class Parando implements Estado{
    /**
     * siguente estado de Parando
     * @return Parado
     */
    public Estado siguiente(){
        return new Parado();
    }
}
