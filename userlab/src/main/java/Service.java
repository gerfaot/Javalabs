public class Service {
    private DAO db;


    public void connectToDB(){
        this.db = new Database();
        System.out.println("Connected to database");
    }

    public User getUser(int id){
        User user = db.getUserById(id);
        return user;
    }


    public User[] getAllUsers(){
        User[] users = db.getAllUsers();
        return users;
    }

    public void addUser(User user){
        db.addUser(user);
    }

    public void deleteUser(int id){

    }

}
