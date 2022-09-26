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


    void getAllUsers(){

    }

    void addUser(User user){

    }

    void deleteUser(int id){

    }

}
