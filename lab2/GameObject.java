package lab2;

abstract class GameObject{
    public int Id,X,Y;
    public String Name;

    public GameObject(int Id, String Name, int X, int Y){
        this.Id = Id;
        this.Name = Name;
        this.X = X;
        this.Y= Y;
    }
    public int getID(){
        return Id;
    }
    public String getName(){
        return Name;
    }
    public int getX(){
        return X;
    }
    public int getY(){
        return Y;
    }
}