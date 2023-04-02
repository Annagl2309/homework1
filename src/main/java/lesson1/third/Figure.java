package lesson1.third;

public class Figure {
    private String name;
    private String color;
    private int cornerQuantity;

    public Figure(String name,String color, int cornerQuantity) {
        this.name = name;
        this.color = color;
        this.cornerQuantity = cornerQuantity;
    }

    public void draw(){
        System.out.println("Нарисованный " + toString());
    }

    @Override
    public String toString() {
        return name + "имеет цвет " + color + "и количество углов " + cornerQuantity;
    }
}
