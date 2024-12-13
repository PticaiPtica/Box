package HomeWork59_60;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book(2, "Морфий", "Михаил Булгаков", true);
        Book book2 = new Book(6, "Чудесный доктор", "Александр Куприн", true);
        Book book3 = new Book(1, "Чудесный доктор", "Александр Куприн", false);
        Book book4 = new Book(3, "Зеленая лампа", "Александр Грин", true);
        Book book5 = new Book(5, "Граф Монте-Кристо", "Александр Дюма", false);
        Book book6 = new Book(4, "Куст сирени", "Александр Куприн", true);
        Book booktest = new Book(10, "Куст сирени", "Александр Куприн", true);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        List library2 = library.getBooks();


        for (Object l : library2)
            System.out.println(l);

        System.out.println();
        List library3 = library.getBooks(false);

        for (Object l : library3)
            System.out.println(l);

        List library4 = library.getBooks(Comparator.comparing(Book::getTitle));

        for (Object l : library4)
            System.out.println(l);


        System.out.println("Количество  книг " + library.countBooks());

        System.out.println("Количество доступных книг " + library.countBooks(true));

        System.out.println("Количество недоступных книг " + library.countBooks(false));

        List Author = library.getAuthorBooks();

        for (Object l : Author)
            System.out.println(l);


        Map<String, List<Book>> listAuthor = library.mapAuthorGroup();
        for (Object l : listAuthor.values())
            System.out.println(l);

        System.out.println();

        Map<Boolean, List<Book>> list = library.booleanListMap();
        for (Object l : list.values())
            System.out.println(l);
    }


}
