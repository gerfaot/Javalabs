import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Phonebook {

    private HashMap<String, Set<String>> phonebook= new HashMap<>();

    //phonebook.add("Orlov", "+798546512");


    public void add(String surname, String numbers){
        phonebook.computeIfAbsent(surname,
                s-> new HashSet<String>())
                .add(numbers);
    }


    public Set<String> get(String surname){
        return phonebook.get(surname);
    }
}
