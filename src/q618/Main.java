package q618;

import java.util.*;

class Person {
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            list.add(new Person(name, height, weight));
        }

        System.out.println("name");
        list.sort((p1, p2) -> p1.name.compareTo(p2.name));
        for (Person p : list) {
            System.out.printf("%s %d %.1f\n", p.name, p.height, p.weight);
        }

        System.out.println("weight");
        list.sort((p1, p2) -> Double.compare(p2.weight, p1.weight));
        for (Person p : list) {
            System.out.printf("%s %d %.1f\n", p.name, p.height, p.weight);
        }
    }
}