package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("book1",10);
        Book book2 = new Book("book2",20);
        Book book3 = new Book("book3",30);
        Book book4 = new Book("Clean code",30);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int i = 0; i < books.length ; i++) {
            Book temp = books[i];
            System.out.println(temp.getName() + " - " + temp.getCount());
        }

        System.out.println("Replace book1 to book4");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length ; i++) {
            Book temp = books[i];
            System.out.println(temp.getName() + " - " + temp.getCount());
        }

        System.out.println("output of books named \"Clean code\".");
        for (int i = 0; i < books.length ; i++) {
            Book temp = books[i];
            if ("Clean code".equals(temp.getName())) {
                System.out.println(temp.getName() + " - " + temp.getCount());
            }
        }
    }
}
