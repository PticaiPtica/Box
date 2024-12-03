package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 2, 1, 4};
        HashSet resultInteger = getUniqueElements(numbers);
        System.out.println(resultInteger);

        String[] words = new String[]{"apple", "banana", "apple", "cherry", "banana"};
        LinkedHashSet<String> resultWords = getOrderedUniqueElements(words);
        System.out.println(resultWords);

        int[] numbers2 = new int[]{10, 20, 30, 40, 50};
        int target = 35;
        int[] result = findClosestNumbers(numbers2, target);
        System.out.println(Arrays.toString(result));
    }


    public static HashSet getUniqueElements(int[] numbers) {
        var result = new HashSet();
        for (int number : numbers) {
            result.add(number);

        }
        return result;
    }

    public static LinkedHashSet<String> getOrderedUniqueElements(String[] words) {
        LinkedHashSet<String> result = new LinkedHashSet<>();
        for (String word : words) {
            result.add(word);

        }
        return result;
    }

    private static int[] findClosestNumbers(int[] numbers2, int target) {
        TreeSet<Integer> resultInteger = new TreeSet<>();
        int[] result = new int[2];
        for (int number : numbers2) {
            resultInteger.add(number);
        }
        result[0] = resultInteger.floor(target);
        result[1] = resultInteger.higher(target);
        return result;


    }


}
