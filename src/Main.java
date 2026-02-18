import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("melon", "watermelon", "apple", "banana", "kiwi", "pineapple", "cherry");
//        System.out.println("No sorted " + words);
//
//        Comparator<String> sortFruits = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };

//        Collections.sort(words, sortFruits);
//        System.out.println("Sorted " + words);

//        Comparator<String> sortFruits1 = (String o1, String o2) -> {
//            return o1.length() - o2.length();
//        };
//
//        Comparator<String> sortFruits2 = ( String o1,  String o2) ->  o1.length() - o2.length();
//
//        Comparator<String> sortFruits3 = Comparator.comparingInt(String::length);
//
//        Collections.sort(words, sortFruits3);
//        System.out.println("Sorted " + words);
//
//        Runnable task1 = () -> {};
//        Runnable task2 = () -> System.out.println("Task1");
//
//        Callable<String> task3 = () -> "ok";
//
//        BiFunction<String, String, String> task4 = (String o1, String o2) -> {
//            return o1 + o2;
//        };

//        words.stream()
//                .sorted()
//                .map( s-> s.toUpperCase(Locale.ROOT))
//                .limit(3)
//                .forEach(System.out::println);
//        System.out.println(words);

//        int [] arr = {10,9,8,7,6,5,4,3,2,1};
//        IntStream stream = Arrays.stream(arr);
//        stream.sorted().forEach(System.out::println);
//        Stream.of(1,2,3,4,5,6,7,8,9,10).forEach(System.out::println);

//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "melon");
//        map.put(2, "watermelon");
//        map.put(3, "apple");
//        map.keySet().stream().forEach(k -> System.out.println(k));
//        map.values().stream().forEach(System.out::println);
//        map.entrySet().stream()
//                .map(e -> e.getValue().toUpperCase(Locale.ROOT) )
//                .forEach(System.out::println);

//        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        List<Integer> collect = num.stream()
//                .filter(n -> n % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println(num);
//        System.out.println(collect);
//        num.stream()
//                .filter(x ->  x % 2 == 0 && x > 5)
//                .forEach(System.out::println);

        List<String> animals = Arrays.asList("кот", "собака", "", "слон", "    ", "тигр");
//        animals.stream()
//                .map(String::trim)
//                .filter(s -> s.length() > 3)
//                .forEach(System.out::print);
//        animals.stream()
//                .map(String::toUpperCase)
//                .map( s-> "Animal: " + s)
//                .forEach(System.out::println);

//        List<Integer> numbers = Arrays.asList(2, 1, 3, 4, 10, 5,  7, 8, 9, 6);
//        numbers.stream().sorted().forEach(System.out::println);
//        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

//        List<String> words2 = Arrays.asList("кот", "собака", "слон", "тигр", "я");
//        words2.stream()
//                .sorted(Comparator.comparing(String::length)
//                        .thenComparing(Comparator.naturalOrder()))
//                .forEach(System.out::println);
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 1, 4, 5, 4, 6);
//        numbers.stream().distinct().forEach(System.out::println);
//        numbers.stream().limit(5).forEach(System.out::println);
//        numbers.stream()
//                .skip(3)
//                .limit(2)
//                .forEach(System.out::println);
        List<String> words3 = Arrays.asList("кот", "собака", "слон", "тигр");
//        words3.stream()
//                .peek( s-> System.out.println("Before: " + s))
//                .map(String::toUpperCase)
//                .peek( s-> System.out.println("After: " + s))
//                .forEach(System.out::println);

//        List<List<String>> list = new ArrayList<>();
//        list.add(words);
//        list.add(animals);
//        list.add(words3);
//        list.stream().flatMap(s -> s.stream().map(String::toUpperCase)).forEach(System.out::println);
        List<Integer> numbers = Arrays.asList(1, 4, 2, 3, 2, 1, 4, 5, 4, 6);
//        Optional count = numbers.stream()
//                .min(Integer::compare);
//        count.ifPresent(System.out::println);
//
//        System.out.println(count);

//        Optional<Integer> first = numbers.stream()
//                .filter(number -> number % 2 == 0)
//                .anyMatch()
//                .allMatch()
//                .noneMatch()
//                .findFirst();
//        first.ifPresent(System.out::println);
//
//        Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
//        System.out.println(sum);
//        Integer reduce = numbers.stream().reduce(1, (a, b) -> a * b);
//        System.out.println(reduce);
//        List<String> words4 = Arrays.asList("Java", "Stream", "API");
//        String concatenated = words4.stream()
//                .reduce("", (a, b) -> a + " " + b)
//                .trim();
//        System.out.println(concatenated);

//        List<String> words5 = Arrays.asList("кот", "собака", "слон", "тигр");
//        Map<String, Integer> collect =
//                words5.stream().collect(
//                Collectors.toMap(
//                        w -> w,
//                        w -> w.length()
//                )
//        );
//        System.out.println(collect);

        List<String> words6 = Arrays.asList(
                "кот", "собака", "слон", "тигр", "лев",
                "волк", "лиса", "медведь", "заяц"
        );

        Map<Integer, List<String>> byLength = words6.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(byLength);
    }
}