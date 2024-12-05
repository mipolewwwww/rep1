package lab5.Bridge;

public class Tout extends Output{
    public Tout(Device dev){
        super(dev);
    }
    @Override
    public void ren(String dt){
        dev.Pr(dt);
    }
}
