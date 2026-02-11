/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LuisG
 */
public class Punto {

    private double x; 
    private double y;
    private String label;
    private int cuadrante;
    private String color;

    public Punto(double x, double y, String label, int cuadrante, String color) {
        this.x = x;
        this.y = y;
        this.label = label;
        this.cuadrante = cuadrante;
        this.color = color;
    }

 
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getLabel() {
        return label;
    }

    public int getCuadrante() {
        return cuadrante;
    }

    public String getColor() {
        return color;
    }

  
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setCuadrante(int cuadrante) {
        this.cuadrante = cuadrante;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Punto " + label +
               " (" + x + ", " + y + ")\n" +
               "Cuadrante: " + cuadrante + "\n" +
               "Color: " + color + "\n";
    }
}
