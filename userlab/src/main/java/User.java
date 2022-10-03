public class User {
    private int id;
    private String name;

    public User(String name, int id){
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString(){
        String userdata = "id: " + id + " name - " + name;
        return userdata;
    }
    
    public int getId() {
        return this.id;
    }

}
