package HomeWork59_60;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book(2, "Морфий", "Михаил Булгаков", true);
        Book book2 = new Book(6, "Чудесный доктор", "Александр Куприн", false);
        Book book23 = new Book(1, "Чудесный доктор", "Александр Куприн", false);
        Book book3 = new Book(3, "Зеленая лампа", "Александр Грин", true);
        Book book4 = new Book(7, "Граф Монте-Кристо", "Александр Дюма", false);
        Book book5 = new Book(4, "Куст сирени", "Александр Куприн", true);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book23);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        System.out.println(library);
        System.out.println(library.getBooks(book2));

        List library2 = library.getBooks();


        for (Object l : library2)
            System.out.println(l);

        System.out.println();
        List library3 = library.getBooks2(false);


        for (Object l : library3)
            System.out.println(l);

        System.out.println(library.countBooks());
        System.out.println(library.countBooks(true));
        System.out.println(library.countBooks(false));

        List Author = library.getAuthorBooks();

        for (Object l : Author)
            System.out.println(l);


    }

}
