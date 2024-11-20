package lab2;

public class Building extends GameObject {
    boolean isBuilt;
    public Building(int Id, String Name, int X, int Y, boolean isBuilt) {
        super(Id, Name, X, Y);
        this.isBuilt = isBuilt;
    }
    public boolean isBuilt(){
        return isBuilt;
    }
}
