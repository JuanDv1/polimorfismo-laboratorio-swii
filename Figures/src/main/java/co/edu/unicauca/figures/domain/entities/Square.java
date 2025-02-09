package co.edu.unicauca.figures.domain.entities;

/**
 *
 * @author FIET-PIS
 */
public class Square extends Figure {
    
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double calculatePerimeter() {
        return side*4;
    }
    
}
