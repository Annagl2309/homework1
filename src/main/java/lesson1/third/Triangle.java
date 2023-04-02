package lesson1.third;

public class Triangle extends Figure{

    public Triangle(String name, String color, int cornerQuantity) {
        super(name, color, cornerQuantity);
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }
}
