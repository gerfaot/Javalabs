public interface DAO {
    User getUserById(int id);
    User[] getAllUsers();
    void addUser(User user);
    void deleteUserById(int id);

}
