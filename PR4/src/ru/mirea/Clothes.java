package ru.mirea;

public abstract class Clothes {
    protected ClothingSize size;
    protected double price;
    protected String color;
    protected String brand;

    public Clothes(ClothingSize size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand + ", размер " + size + ", цвет " + color
                + ", цена " + (int) price + " руб.";
    }
}
