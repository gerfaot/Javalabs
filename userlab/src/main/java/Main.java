public class Main {
    public static void main(String[] args) {
        User user1 = new User("Ivan", 1);
        Service service = new Service();
        service.connectToDB();
        System.out.println(service.getUser(3));


    }
}
