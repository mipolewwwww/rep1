package lab2;

public class Fort extends Building implements Attacker {
    public float damage;
    public Fort(int Id, String Name, int X, int Y, boolean isBuilt,float damage){
        super(Id, Name,X,Y,isBuilt);
        this.damage=damage;
    }
    public void attack(Unit unit){
        unit.receiveDamage(damage);
    }
}
