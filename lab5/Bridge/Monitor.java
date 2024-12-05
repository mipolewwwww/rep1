package lab5.Bridge;

public class Monitor implements Device{
    @Override
    public void Pr(String dt){
        System.out.println("Display1"+dt);
    }
}
