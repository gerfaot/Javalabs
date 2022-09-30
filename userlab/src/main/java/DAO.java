public interface DAO {
    User getUserById(int id);
    User[] getAllUsers();
    void addUser(String name, int id);
    void deleteUser(int id);

}
