public class Database implements DAO{

    private User[] allUsers = new User[10];


    @Override
    public User getUserById(int id) {
        for (User user : allUsers) {
            if(user.getId == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User[] getAllUsers() {
        return allUsers;
    }

    @Override
    public void addUser(User user) {
        for (int i = 0; i < allUsers.length; i++) {
            if(allUsers[i] == null) {
                allUsers[i] = user;
                break;
            }
        }
    }

    @Override
    public void deleteUser(int id) {
        
    }
}

