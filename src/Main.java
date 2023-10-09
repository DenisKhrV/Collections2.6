import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 10, 2, 44, 33, 3, 4, 4, 5, 5, 6, 7, 20));
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три", "четыре", "четыре", "четыре", "четыре"));
        printOnlyOddNumbers(nums);
        printOnlyEvenNumbers(nums);
        printAllUniqueWords(strings);
        numberOfDuplicatesForEachUniqueWord(strings);
    }

    static void printOnlyOddNumbers(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : nums) {
            if (i % 2 != 0) {
                result.add(i);
            }
        }
        System.out.print(result);
        System.out.println();
    }

    static void printOnlyEvenNumbers(List<Integer> list) {
        Set<Integer> result = new TreeSet<>(list);
        for (Integer i : list) {
            if (i % 2 != 0) {
                result.remove(i);
            }
        }
        System.out.println(result);
    }

    static void printAllUniqueWords(List<String> list) {
        Set<String> result = new HashSet<>(list);
        System.out.println(result);
    }

    static void numberOfDuplicatesForEachUniqueWord(List<String> strings) {
        Map<String, Integer> countByWord = new HashMap<>();
        for (String str : strings) {
            Integer counter = 1;
            if (!countByWord.containsKey(str)) {
                countByWord.put(str, counter);
            } else {
                countByWord.put(str, countByWord.get(str) + 1);
            }
        }
//        System.out.println(countByWord.values());
//        System.out.println(countByWord.entrySet());
//        System.out.println(countByWord);

        for (Map.Entry <String, Integer> e : countByWord.entrySet()) {
//            if (e.getValue() >= 1) {
                System.out.println(e.getValue());
//            }
        }
    }
}