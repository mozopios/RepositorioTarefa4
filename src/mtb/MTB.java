/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mtb;

/**
 *Extiende de Bicicleta y implementa InterfazMTB
 * @author Aaron Míguez
 */
public class MTB extends Bicicleta implements InterfazMTB{
    public int altoAsiento;
    public int marcha;

    /**
     * La subclase tiene un constructor
     * @param cadenciaIni 
     * @param velocidadIni
     * @param marchaIni
     * @param altoIni 
     */
    public MTB(int cadenciaIni, int velocidadIni, int marchaIni,int altoIni)
    {
        super(cadenciaIni, velocidadIni);
        altoAsiento = altoIni;
    }

    /**
     * Estable un nuevo AltoAsiento
     * @param nuevoValor nuevo valor para setAltoAsiento
     */
    @Override
    public void setAltoAsiento(int nuevoValor)
    {
        altoAsiento = nuevoValor;
    }

    /**
     * 
     * @return altoAsiento 
     */
    @Override
    public int getAltoAsiento()
    {
        return altoAsiento;
    }
    
    /**
     * Main de MTB
     * @param args 
     */

    public static void main (String [] args )
    {
        MTB mtb;

        mtb=new MTB(10, 30, 8, 40);

        System.out.println("Cadencia: "+mtb.getCadencia());
        System.out.println("Marcha: "+mtb.getMarcha());
        System.out.println("Velocidad: "+mtb.getVelocidad());
        System.out.println("Alto asiento: "+mtb.getAltoAsiento());
    }
    
    /**
     * Establece una nueva marcha
     * @param nuevaMarcha 
     */
    public void setMarcha(int nuevaMarcha) {
        //establecer marcha
        marcha = nuevaMarcha;
    }
    
    /**
     * 
     * @return marcha
     */
    public int getMarcha() {
        return marcha;
    }
}
