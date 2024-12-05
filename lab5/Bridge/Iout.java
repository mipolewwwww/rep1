package lab5.Bridge;

public class Iout extends Output {
    public Iout(Device dev){
        super(dev);
    }
    @Override
    public void ren(String dt){
        dev.Pr("Imaginary" + dt);
    }
}
