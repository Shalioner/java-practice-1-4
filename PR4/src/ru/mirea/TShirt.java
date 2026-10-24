package ru.mirea;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка:");
        System.out.println(this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка:");
        System.out.println(this);
    }
}
