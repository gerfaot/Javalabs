package robothumancat;

public class Wall implements Obstruction{

    int height;

    public Wall(int height){
        if (height > 0){
            this.height = height;
        }
    }
}
