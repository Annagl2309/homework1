package lesson2.second;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cats = new ArrayList<>();
        cats.add("Martin");
        cats.add("Markus");
        cats.add("Meison");
        cats.add("Barsik");

        cats.add(1, "Misha");

        cats.set(1, "Rex");

        cats.remove("Barsik");

        System.out.println(cats);
        System.out.println(cats.contains("Barsik"));
        System.out.println(cats.size());
        System.out.println(cats.get(2));
        System.out.println(cats.indexOf("Martin"));
    }
}
