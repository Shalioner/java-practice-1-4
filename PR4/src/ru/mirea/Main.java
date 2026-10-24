package ru.mirea;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Времена года");
        Season favorite = Season.AUTUMN;
        System.out.println("Мое любимое время года:");
        System.out.println(favorite.getName());
        System.out.println("Средняя температура:");
        System.out.println(favorite.getTemperature());
        printSeason(favorite);

        for (Season season : Season.values()) {
            System.out.println();
            System.out.println(season.getName());
            System.out.println("Температура:");
            System.out.println(season.getTemperature());
            System.out.println(season.getDescription());
        }

        System.out.println();
        System.out.println("Ателье");
        Random random = new Random();
        Clothes[] clothes = {
                new TShirt(ClothingSize.M, 600 + random.nextInt(900), "Белый"),
                new Pants(ClothingSize.L, 1800 + random.nextInt(1700), "Черный"),
                new Skirt(ClothingSize.S, 1300 + random.nextInt(1400), "Бежевый"),
                new Tie(ClothingSize.M, 400 + random.nextInt(700), "Синий")
        };
        clothes[0].setBrand("ТВОЕ");
        clothes[1].setBrand("Gloria Jeans");
        clothes[2].setBrand("ZARINA");
        clothes[3].setBrand("O'STIN");

        Atelier atelier = new Atelier();
        System.out.println("Мужская одежда:");
        atelier.dressMan(clothes);
        System.out.println("Женская одежда:");
        atelier.dressWomen(clothes);
    }

    public static void printSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Зимой нравится снег и морозная погода.");
                break;
            case SPRING:
                System.out.println("Весной становится теплее и всё зеленеет.");
                break;
            case SUMMER:
                System.out.println("Летом можно долго гулять вечером.");
                break;
            case AUTUMN:
                System.out.println("Осенью нравится прохлада и разноцветные листья.");
                break;
        }
    }
}
