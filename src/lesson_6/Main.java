package lesson_6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<Integer> integerComparator = Integer::compareTo;
        SortedMap<Integer, String> map = new TreeMap<>(integerComparator);
        Collections.sort(new ArrayList<String>(), (o1, o2) -> o2.compareTo(o1));

        List<String> names = List.of("Milan", "Marco", "Lisa", "Nikola", "Maximilian", "Maximilian");

        names.forEach(System.out::println);

        List<String> filtered = names.stream()
                .filter(s -> s.startsWith("M"))
                .sorted(Comparator.reverseOrder())
                .distinct()
                .filter(s -> s.length() > 5)
                .toList();

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> nameLengths = names.stream().map(s -> s.length()).toList();
        System.out.println(nameLengths);
        boolean anyNumberGreaterThan10 = numbers.stream()
                .filter(integer -> integer > 0)
                .anyMatch(integer -> integer > 10);
        Optional<Integer> result = numbers.stream()
                .filter(integer -> integer > 0)
                .sorted(((o1, o2) -> o2.compareTo(o1)))
                .findFirst();
        result.ifPresent(System.out::println);
       numbers.stream()
                .filter(integer -> integer < 0)
                .min(Integer::compare).ifPresent(System.out::println);
    }

}
