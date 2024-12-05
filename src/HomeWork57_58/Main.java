package HomeWork57_58;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }
    /**
     * 1. Реализация своего интерфейса
     * Создайте интерфейс Printer с методом void print(String message). Напишите код, где вы:
     * •	Создаете экземпляр Printer с помощью анонимного класса, который выводит сообщение в консоль.
     * •	Используете созданный экземпляр для вызова метода print.
     * Сделайте то же самое (вторую реализацию) с помощью лямбда-выражения.
     * А теперь напишите третью реализацию также с помощью лямбды - измените реализацию так,
     * чтобы выводилось сначала само сообщение,
     * а потом сразу еще второе сообщение – «длина сообщения – n»
     * (тут надо будет использовать фигурные скобки в лямбде).
     *
     */

    private static void task1() {
        Printer printer = new Printer() {
            @Override
            public void print(String Message) {
                System.out.println(Message);
            }
        };
        printer.print("Вариант 1");

        //Printer printer2 = message -> System.out.println(message);
        // идея  пишет что можно даже так )

        Printer printer2 = System.out::println;

        printer2.print("Вариант 2");

        Printer printer3 = message -> System.out.println("'" + message + "'" +
                " Длинна сообщения " + (message.length()));
        printer3.print("Вариант 3 с длинной ");

        Printer printer4 = message -> {
            System.out.println(message);
            System.out.println("Длинна сообщения " + (message.length()));
        };
        printer4.print("Вариант 4 ");
    }
/**
 * 2. Сортировка списка строк с использованием Comparator
 * Создайте список имен, например, List<String> names = Arrays.asList(//любые имена).
 * •	Отсортируйте этот список в обратном порядке, используя анонимный класс для реализации интерфейса Comparator<String>.
 * •	Отсортируйте его так же с помощью лямбда-выражения.

 */
         private static void task2() {
        List<String> names = Arrays.asList("Bob", "John", "Jane", "Robert", "Anna");
        List<String> names2 = Arrays.asList("Bob", "Lie", "Jane", "Robert", "Anna");
        System.out.println("Изначальный лист имен 1 " + names);
        System.out.println("Изначальный лист имен 2 " + names2);

        Comparator<String> comparator = new Comparator<>() {

            @Override
            public int compare(String o1, String o2) {

                return o2.compareTo(o1);
            }
        };
        Collections.sort(names, comparator);
        System.out.println("Сортировка   1 листа" + names);

        Comparator<String> comparator2 = (o1, o2) -> o2.compareTo(o1);
        Collections.sort(names2, comparator2);
        System.out.println("Сортировка   2 листа" + names2);


    }

    /**
     * 3.*по желанию. Сортировка списка объектов с использованием Comparator
     * Создайте список машин/студентов/животных/задач/чего угодно, главное чтобы было несколько полей в объекте. Можете использовать задание с Task и PriorityQueue, сделав несколько очередей с одними и теми же задачами, но с разной сортировкой.
     * •	С помощью лямбда-выражения задайте порядок сортировки объектов по двум (или больше) полям
     */
    private static void task3() {
        Pet cat = new Pet("Кот", 2);
        Pet dog = new Pet("Пес", 5);
        Pet parrot = new Pet("Попугай", 2);
        Pet hamster = new Pet("Хомяк", 1);

        Comparator<Pet> comparator = (o1, o2) -> o1.getAge() - o2.getAge();
        Comparator<Pet> comparator2 = (o1, o2) -> o1.getName().compareTo(o2.getName());
        Comparator<Pet> comparator3 = (o1, o2) -> {
            if (Objects.equals(o1.getAge(), o2.getAge())) {
                return o1.getName().compareTo(o2.getName());
            } else {
                return o1.getAge() - o2.getAge();
            }
        };
        PriorityQueue<Pet> pets1 = new PriorityQueue<>(comparator);
        pets1.add(cat);
        pets1.add(dog);
        pets1.add(parrot);
        pets1.add(hamster);

        while (!pets1.isEmpty()) {
            System.out.println(pets1.poll());
        }
        System.out.println(

        );
        PriorityQueue<Pet> pets2 = new PriorityQueue<>(comparator2);
        pets2.add(cat);
        pets2.add(dog);
        pets2.add(parrot);
        pets2.add(hamster);

        while (!pets2.isEmpty()) {
            System.out.println(pets2.poll());
        }
        System.out.println();

        PriorityQueue<Pet> pets3 = new PriorityQueue<>(comparator3);
        pets3.add(cat);
        pets3.add(dog);
        pets3.add(parrot);
        pets3.add(hamster);

        while (!pets3.isEmpty()) {
            System.out.println(pets3.poll());
        }


    }

    /**
     * 4. Работа со списком через stream api
     * Дано: List<String> words = Arrays.asList("apple", "banana", "fig", "date", "kiwi", "grape").
     * •	Используя Stream API, преобразуйте все строки в верхний регистр (map)
     * •	Выберите все строки длиной больше 4 символов (filter)
     * •	Отсортируйте список строк по длине (от самой короткой к самой длинной) (sorted)
     * •	Выведите результат в новый список, напечатайте его в консоль
     *
     * Подумайте – играет ли роль порядок вызова методов (поэкспериментируйте с перестановкой).
     * Влияет ли это на результат, может ли влиять на что-то другое?
     * Если может влиять, то в каком порядке их лучше расположить?
     */
    private static void task4() {
        List<String> words = Arrays.asList("apple", "banana",
                "fig", "date", "kiwi", "grape");
        words.stream().
                map(String::toUpperCase)
                .filter(word -> word.length() > 4)
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);

        System.out.println("Лучший вариант по моему мнению");

        words.stream()
                .filter(word -> word.length() > 4) // Сразу ограничить количество операций
                .map(String::toUpperCase) // тут не вижу разницы
                .sorted(Comparator.comparingInt(String::length)) //
                .forEach(System.out::println);

    }
}
