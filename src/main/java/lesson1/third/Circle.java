package lesson1.third;

public class Circle extends Figure{

    public Circle(String name, String color, int cornerQuantity) {
        super(name, color, cornerQuantity);
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }
}
