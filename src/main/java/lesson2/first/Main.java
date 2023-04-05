package lesson2.first;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> workers = new LinkedList<>();
        workers.add("Anna");
        workers.add("Nikita");
        workers.add("Sasha");
        workers.add(2, "Lera");

        workers.remove(2);

        workers.addFirst("Julia");
        workers.addLast("Vlada");


        System.out.println(workers);
        System.out.println(workers.get(3));
        System.out.println(workers.indexOf("Anna"));
    }
}
