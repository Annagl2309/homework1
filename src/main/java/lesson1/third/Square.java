package lesson1.third;

public class Square extends Figure{
    public Square(String name, String color, int cornerQuantity) {
        super(name, color, cornerQuantity);
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }
}
