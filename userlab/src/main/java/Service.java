public class Service {
    DAO db;


    void connectToDB(){
        this.db = new Database();
        System.out.println("Connected to database");
    }

    User getUser(int id){
        User user = db.getUserById(id);
        return user;
    }


    User[] getAllUsers(){
        User[] users = db.getAllUsers();
        return users;
    }

    void addUser(User user){

    }

    void deleteUser(int id){

    }

}
