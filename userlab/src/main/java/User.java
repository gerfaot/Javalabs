public class User {
    int id;
    String name;

    public User(String name, int id){
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString(){
        String userdata = "id: " + id + " name - " + name;
        return userdata;
    }

}
