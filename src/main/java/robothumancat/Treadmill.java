package robothumancat;

public class Treadmill implements Obstruction {
    int speed;

    public Treadmill(int speed){
        if (speed > 0){
            this.speed = speed;
        }
    }
    @Override

}
