public class Service {
    private DAO db;


    public void connectToDB(){
        this.db = new Database();
        System.out.println("Connected to database");
    }

    public User getUser(int id){
        if (id < 1){
            throw new IllegalArgumentException();
        }
        return db.getUserById(id);
    }


    public User[] getAllUsers(){
        return db.getAllUsers();
    }

    public void addUser(User user){
        db.addUser(user);
    }

    public void deleteUserById(int id){
        if (id < 1){
            throw new IllegalArgumentException();
        }
        db.deleteUserById(id);

    }

}
