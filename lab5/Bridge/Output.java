package lab5.Bridge;

public abstract class Output {
    protected Device dev;
    public Output(Device dev){
        this.dev = dev;
    }
    public abstract void ren(String dt);
}
