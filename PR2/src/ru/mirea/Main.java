package ru.mirea;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Иван", "ivan@mail.ru", 'M');
        System.out.println(author);
        author.setEmail("new@mail.ru");
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        System.out.println(author);
    }
}
