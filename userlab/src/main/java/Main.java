import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.connectToDB();
        User user1 = new User("Anton", 1);
        User user2 = new User("Vlad", 2);
        service.addUser(user1);
        service.addUser(user2);
        service.deleteUserById(3);
        System.out.println(Arrays.toString(service.getAllUsers()));
        System.out.println(service.getUser(2));


    }
}
