/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_laboratorio_4;

import java.awt.Color;

/**
 *
 * @author Francisco Pagoaga
 */
public class MiExepcion extends Exception {
    private Color color=Color.red;
    public MiExepcion() {
    }

    public MiExepcion(String message) {
        super(message);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
}
