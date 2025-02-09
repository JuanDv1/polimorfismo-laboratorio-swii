package co.edu.unicauca.figures.domain.entities;

/**
 * Triángulo Equilátero
 * @author 
 */
public class Triangle extends Figure {
    
    private double lado;

    public Triangle(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculateArea() {
        double altura = (Math.sqrt(3) / 2) * lado; // Altura del triángulo equilátero
        return (lado * altura) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return lado * 3;
    }
}
