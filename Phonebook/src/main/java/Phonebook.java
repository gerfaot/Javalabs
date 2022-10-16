import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Phonebook {

    private HashMap<String, Set<String>> phonebook= new HashMap<>();

    //phonebook.add("Orlov", "+798546512");


    public void add(String surname, String numbers){
        if(surname !=null && !surname.isEmpty() && numbers != null && !numbers.isEmpty()) {
            phonebook.computeIfAbsent(surname,
                    s -> new HashSet<>())
                    .add(numbers);
        }
        else {
            System.out.println("Ошибка ввода");
        }
    }


    public Set<String> get(String surname){
        if(surname !=null && !surname.isEmpty()) {
            return phonebook.get(surname);
        }
        Set<String> exc = new HashSet<>();
        exc.add("Ошибка ввода");
        return exc;
    }
}
