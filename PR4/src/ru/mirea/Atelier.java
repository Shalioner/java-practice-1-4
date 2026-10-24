package ru.mirea;

public class Atelier {
    public void dressMan(Clothes[] clothes) {
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof MenClothing) {
                MenClothing item = (MenClothing) clothes[i];
                item.dressMan();
            }
        }
    }

    public void dressWomen(Clothes[] clothes) {
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof WomenClothing) {
                WomenClothing item = (WomenClothing) clothes[i];
                item.dressWomen();
            }
        }
    }
}
