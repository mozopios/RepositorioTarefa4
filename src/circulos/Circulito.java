/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulos;

/**
 * Clase Circulito
 *
 * @author Aarón Míguez
 */
public class Circulito {
    /**
     * Cordenada X del círculo
     */
    private int coordenadaX;
    /**
     * Cordenada Y del círculo
     */
    private int coordenadaY;
    /**
     * Radio del círulo
     */
    private double radio;
    
    
    /**
     *Constructor del Circulito
     */
    public Circulito() {
    }
    
    /**
     * Constructor del Circulito
     * @param x 
     * @param y
     * @param radio 
     */
    public Circulito(int x, int y, double radio) {
        this.coordenadaX = x;
        this.coordenadaY = y;
        setRadio(radio);
    }
    /**
     * Le pasamos como valor la coordenadaX
     * @param coordenadaX 
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }
    /**
     * Le pasamos como valor la cordenadaY
     * @param coordenadaY 
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
    /**
     * Le pasamos como valor el radio
     * @param radio 
     */
    public void setRadio(double radio) {
        this.radio = radio < LIMITERADIO ? LIMITERADIO : radio;
    }
    private static final double LIMITERADIO = 0.0;
    /**
     * Obtiene la coordenadaX
     * @return coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }
    /**
     * Obtiene la cordenadaY
     * @return coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }
    /**
     * Obtiene el radio
     * @return radio
     */
    public double getRadio() {
        return radio;
    }
    /**
     * Obtiene el diametro del circulo 
     * devuelve el radio * 2
     * @return 
     */
    public double getDiametro() {
        return radio * 2;
    }
    /**
     * Obtiene el perimetro del circulo
     * @return PI * el diametro 
     */
    public double getPerimetro(){
        return Math.PI * getDiametro();
    }   
    /**
     * Obtiene el Area del Circulo
     * @return PI * el radio²
     */
    public double ObtenerArea(){
        return Math.PI * radio * radio;
    } 
    /**
     * Le pasamos como valores trasladarX y trasladarY, esos valores seran los nuevos valores de coordenadaX y coordenadaY
     * @param trasladarX
     * @param trasladarY 
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        coordenadaX += trasladarX;
        coordenadaY += trasladarY;
    }
    /**
     *Metodo toString de Circulito
     * @return coordenadaX + coordenadaY + radio
     */
    @Override
    public String toString() {
        return "Circulo{" + "x=" + coordenadaX + ", y=" + coordenadaY + ", radio=" + radio + '}';
    }
    
    

            

}
