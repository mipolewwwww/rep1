package lab2;

public class Unit extends GameObject {
    public Boolean isAlive;
    public float Hp;
    public Unit(int Id, String Name, int X, int Y, boolean isAlive,float Hp){
        super(Id,Name,X,Y);
        this.isAlive = isAlive;
        this.Hp=Hp;
    }
    public boolean isAlive(){
        if (Hp > 0){
            return true;
        }
        else{
            return false;
        }
    }
    public float getHp(){
        return Hp;
    }
    public void receiveDamage(float damage){
        Hp=getHp()-damage;
    }
}