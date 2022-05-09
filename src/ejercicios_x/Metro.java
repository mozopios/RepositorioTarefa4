/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_x;

/**
 *Clase Metro
 * @author Aarón Míguez
 */
public class Metro {
    /**
     * estado del metro
     */
    private Estado estado;
    /**
     * Estado Parado
     */
    static final private Estado PARADO = new Parado();
    /**
     * Estado En_Marcha
     */
    static final private Estado EN_MARCHA = new En_Marcha();
    /**
     * Estado Parando
     */
    static final private Estado PARANDO = new Parando();
    /**
     * Estado Arrancando
     */
    static final private Estado ARRANCANDO = new Arrancando();
    
    
    /**
     * Cambia el estado del Metro
     */
    public void cambiaEstado() {
        estado = estado.siguiente();
    }
    /**
     * Consigue el estado actual del Metro
     * @return Estado del Metro
     */
    public Estado conseguirEstado(){
        return estado;
    }
    /**
     * Inicia el estado
     */
    public void iniciarEstado(){
        estado = new Parado();
    }

}
