package lab2;

public class Archer extends Unit implements Attacker, Moveable {
    float damage;
    public Archer(int Id, String Name, int X, int Y, boolean isAlive,float Hp,float damage){
        super(Id,Name,X,Y,isAlive,Hp);
        this.damage=damage;
    }
    public void attack(Unit unit){
        unit.receiveDamage(damage);
    }
    public void move(int X,int Y){
        this.X = getX()+X;
        this.Y = getY()+Y;
    };
}
