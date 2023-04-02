package lesson1.third;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure("Треугольник", "красный", 3);

        Figure square = new Square("квадрат", "желтый", 4);
        Figure circle = new Circle("Круг", "белый", 0);



        List<Figure> picture = Arrays.asList(figure, square, circle);
        for (Figure f : picture) {
            f.draw();
        }
    }
}
