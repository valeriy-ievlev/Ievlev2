package Lesson1;

public class Main {
    public static void main(String[] args) {
        Activity[] participants = {
                new Person(5, 3),
                new Cat(4, 6),
                new Robot(9, 9)};
        Barrier[] barriers = {
                new Treadmill(5),
                new Wall(5)};


        for (Activity p : participants) {
            System.out.println(p.getClass());
            for (Barrier b : barriers) {
                b.getBarrier(p, b);
            }
        }
    }
}
