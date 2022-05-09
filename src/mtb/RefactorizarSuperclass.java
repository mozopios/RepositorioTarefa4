/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mtb;


/**
 * Clase RefactorizarSuperclass
 * @author Aarón Míguez
 */
public class RefactorizarSuperclass {
    
    public int velocidad;
    
    public RefactorizarSuperclass() {
    }
    
    /**
     * Frena
     * @param decremento 
     */
    public void frenar(int decremento) {
        velocidad -= decremento;
    }
    
    /**
     * Acelera
     * @param incremento 
     */
    public void acelerar(int incremento) {
        velocidad += incremento;
    }
    
    /**
     * Devuelve la velocidad
     * @return veocidad
     */
    public int getVelocidad() {
        return velocidad;
    }
    
}
