package ru.mirea;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны:");
        System.out.println(this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны:");
        System.out.println(this);
    }
}
