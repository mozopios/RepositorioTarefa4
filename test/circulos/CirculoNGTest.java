/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulos;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Esther Ferreiro
 */
public class CirculoNGTest {

    public CirculoNGTest() {
    }

    /**
     * Test of setX method, of class Circulito.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        Circulito instance = new Circulito();
        instance.setCoordenadaX(x);
    }

    /**
     * Test of setY method, of class Circulito.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        Circulito instance = new Circulito();
        instance.setCoordenadaY(y);
    }

    /**
     * Test of setRadio method, of class Circulito.
     */
    @Test
    public void testSetRadio() {
        System.out.println("setRadio");
        double radio1 = 0.0;
        double radio2 = 0.1;
        double radio3 = -0.1;
        Circulito instance = new Circulito();
        instance.setRadio(radio1);
        instance.setRadio(radio2);
        instance.setRadio(radio3);
    }

    /**
     * Test of getX method, of class Circulito.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Circulito instance = new Circulito(0, 0, 0.1);
        int expResult = 0;
        int result = instance.getCoordenadaX();
        assertEquals(result, expResult);
    }

    /**
     * Test of getY method, of class Circulito.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Circulito instance = new Circulito(0, 0, 0.1);
        int expResult = 0;
        int result = instance.getCoordenadaY();
        assertEquals(result, expResult);
    }

    /**
     * Test of getRadio method, of class Circulito.
     */
    @Test
    public void testGetRadio() {
        System.out.println("getRadio");
        Circulito instance = new Circulito(0, 0, 0.1);
        double expResult = 0.1;
        double result = instance.getRadio();
        assertEquals(result, expResult, 0.0);
    }

    /**
     * Test of getDiametro method, of class Circulito.
     */
    @Test
    public void testGetDiametro() {
        System.out.println("getDiametro");
        Circulito instance = new Circulito(0, 0, 0.1);
        double expResult = 0.2;
        double result = instance.getDiametro();
        assertEquals(result, expResult, 0.0);
    }

    /**
     * Test of getPerimetro method, of class Circulito.
     */
    @Test
    public void testGetPerimetro() {
        System.out.println("getPerimetro");
        Circulito instance = new Circulito(0, 0, 0.1);
        double expResult = 0.6283185;
        double result = instance.getPerimetro();
        assertEquals(result, expResult, 1E-6);;
    }

    /**
     * Test of ObtenerArea method, of class Circulito.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Circulito instance = new Circulito(0, 0, 0.1);
        double expResult = 0.0314159;
        double result = instance.ObtenerArea();
        assertEquals(result, expResult, 1E-6);
    }

    /**
     * Test of trasladarCentro method, of class Circulito.
     */
    @Test
    public void testTrasladarCentro() {
        System.out.println("trasladarCentro");
        Circulito instance = new Circulito();
        int resultx = instance.getCoordenadaX();
        int resulty = instance.getCoordenadaY();
        instance.trasladarCentro(0, 0);
        int resultnx = instance.getCoordenadaX();
        int resultny = instance.getCoordenadaY();
        assertEquals(resultnx, resultx + 5);
        assertEquals(resultny, resulty + 5);
    }


}
