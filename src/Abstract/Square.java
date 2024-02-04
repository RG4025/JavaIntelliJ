package Abstract;

public class Square extends Shapes{

    public  final  double side;

    public Square(double si){
        this.side = si;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side,2);
    }
}
