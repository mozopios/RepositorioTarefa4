/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_x;

/**
 *Interfaz Estado
 * @author Aarón Míguez
 */
interface Estado {
    /**
     * Sigueiente estado
     * @return siguiente
     */
    public Estado siguiente();
}
