package robothumancat;


public class Human implements Member {
    String name;
    int stamina;

    public Human(String name, int stamina){
        if (stamina < 0) {
            this.stamina = stamina;
        }
        this.name = name;
    }

    @Override
    public void run(Treadmill road) {
        System.out.println(name + " пробежал");
    }

    @Override
    public void jump(Wall wall){
        System.out.println(name + " перепрыгнул");

    }
}
