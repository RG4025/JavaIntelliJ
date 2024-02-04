package Abstract;

public class Circle extends Shapes{

    private final double radius;

    public Circle(double radi){
        this.radius = radi;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius,2);
    }
}
