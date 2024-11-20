package lab2;
public class MobileHome extends Building implements Moveable {
    public MobileHome(int Id, String Name, int X, int Y, boolean isBuilt){
        super(Id,Name,X,Y,isBuilt);
    }
    public void move(int X,int Y){
        this.X = getX() + X;
        this.Y = getY() + Y;
    };
}
