public class Database implements DAO{

    User[] allUsers = new User[10];


    @Override
    public User getUserById(int id) {
        User user = new User("Vasya", id);
        return user;
    }

    @Override
    public User[] getAllUsers() {
        allUsers[0] = new User("Ivan", 4);
        allUsers[1] = new User("Jack", 5);
        allUsers[2] = new User("John", 6);
        allUsers[3] = new User("Anton", 7);
        allUsers[4] = new User("Boris", 8);
        return allUsers;
    }

    @Override
    public void addUser(String name, int id) {
        User newUser = new User(name, id);
    }

    @Override
    public void deleteUser(int id) {

    }
}

