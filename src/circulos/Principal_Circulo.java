/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * Main del circulo
 * @author Aaron Miguez
 */
public class Principal_Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            Circulito circulo = new Circulito(837, 43, 2.5);

            String salida = " La coordenada X es " + circulo.getCoordenadaX()
                    + "\nLa coordenada Y es " + circulo.getCoordenadaY()
                    + "\nEl radio es " + circulo.getRadio();

            circulo.trasladarCentro(0, 0);
            
            circulo.setRadio(4.25);
            salida += "\nLa nueva ubicación y el radio del círculo son " + circulo.toString();

            DecimalFormat dosDigitos = new DecimalFormat("0.00");
            salida += "\nEl diámetro es " + dosDigitos.format(circulo.getDiametro());
            salida += "\nEl perímetro es " + dosDigitos.format(circulo.getPerimetro());
            salida += "\nEl área es " + dosDigitos.format(circulo.ObtenerArea());

            JOptionPane.showMessageDialog(null, salida);

            System.exit(0);
   
    }
    
}
