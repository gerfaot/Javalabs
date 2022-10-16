import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("A");
        words.add("B");
        words.add("B");
        words.add("C");
        words.add("C");
        words.add("C");
        words.add("D");
        words.add("R");
        words.add("T");
        words.add("Y");
        words.add("R");
        words.add("A");
        System.out.println(words.contains("A"));
        System.out.println(words);
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);

//        for (String word : uniqueWords){
//            int i = 0;
//            if (words.contains(word)){
//                i++;
//                System.out.println(word + " - " + i);
//            }
//        }

        Map<String, Integer> freq = words.stream() // поток круто и красиво, но непонятно, тяжело читаемо
                .collect(Collectors.toMap(
                        e -> e,
                        e -> 1,
                        Integer::sum));
        freq.forEach((k, v) -> System.out.println(k + ": " + v));

        Phonebook phonebook = new Phonebook();
        //phonebook.add("asd", Set<String>)
        phonebook.add("Orlov", "+7119852123");
        phonebook.add("Orlov", "+7998546512");
        phonebook.add("", "78907");
        System.out.println(phonebook.get("Orlov"));
        System.out.println(phonebook.get(""));

    }
}
