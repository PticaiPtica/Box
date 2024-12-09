package HomeWork59_60;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class Library {
    public static Map<Integer, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    /**
     * Метод получения книги из библиотеки
     * @param id
     * @return
     */
    public Book getBook(Integer id) {
        return books.get(id);
    }

    public Book getBooks(Book book) {
        if (book.getIsAvailable()) {
            System.out.println("Книга доступна " + book);
            return book;
        } else {
            System.out.println("Книга недоступна " + book);
            return null;
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}' + '\'';
    }

    /**
     * Метод добавляет книгу в класс
     * @param book
     */
    public void addBook(Book book) {
        books.put(book.getId(), book);

    }

    /**
     * Получение List с книгами
     * @return List
     */
    public List getBooks() {
        return books.values().stream().sorted(Comparator.comparing(Book::getTitle)).toList();
    }

    /**
     * Получение List с книгами доступных или недоступных
     * @return List
     */
    public List getBooks2(Boolean rest) {
        if (rest) {
            return books.values().stream().filter(Book::getIsAvailable).toList();
        }
        return books.values().stream().filter(book -> !book.getIsAvailable()).toList();

    }

    /**
     *	Получения количества книг
     * @return countBooks
     */
    public Integer countBooks() {
        return books.size();
    }

    /**
     * Получения количества книг (также два метода – получения количества всех книг,
     * а второй – количества доступных/недоступных книг)
     * @param rest
     * @return countBooks
     */
    public Integer countBooks(Boolean rest) {
        if (rest) {
            return books.values().stream().filter(Book::getIsAvailable).toList().size();
        }
        return books.values().stream().filter(book -> !book.getIsAvailable()).toList().size();
    }

    /**+
     * Получения списка авторов,
     * без дубликатов (использовать метод distinct) с сортировкой по алфавиту
     * @return List
     */
    public List getAuthorBooks() {
        List<String> AuthorBooks = new ArrayList<>();
        books.values().stream()
                .forEach(book -> AuthorBooks.add(book.getAuthor()));
        return AuthorBooks.stream().
                sorted(Comparator.naturalOrder())
                .distinct()
                .toList();
    }


}

