package ru.mirea;

public class Main {
    public static void main(String[] args) {
        // Задание 1. Фигуры
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        Circle c1 = (Circle) s1;
        System.out.println(c1.getRadius());

        Shape s3 = new Rectangle(1, 2, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        Rectangle r2 = (Rectangle) s4;
        Square sq1 = (Square) r2;
        System.out.println(sq1.getSide());

        // Ошибочные строки из задания оставлены в комментариях:
        // s1.getRadius();       // у Shape нет getRadius()
        // Shape s2 = new Shape(); // Shape - абстрактный класс
        // s3.getLength();       // у Shape нет getLength()
        // s4.getSide();         // у Shape нет getSide()
        // r2.getSide();         // у Rectangle нет getSide()

        // Задание 2. Движение
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        p.moveUp();
        System.out.println(p);

        MovableCircle mc = new MovableCircle(1, 1, 2, 2, 5);
        mc.moveRight();
        System.out.println(mc);

        MovableRectangle mr = new MovableRectangle(0, 4, 6, 0, 1, 1);
        System.out.println(mr.sameSpeed());
        mr.moveDown();
        System.out.println(mr);
    }
}
