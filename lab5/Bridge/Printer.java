package lab5.Bridge;

public class Printer implements Device{
    @Override
    public void Pr(String dt){
        System.out.println("Display2"+dt);
    }
}
