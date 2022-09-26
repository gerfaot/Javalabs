public class Database implements DAO{

    @Override
    public User getUserById(int id) {
        User user = new User("Vasya", id);
        return user;
    }
}

