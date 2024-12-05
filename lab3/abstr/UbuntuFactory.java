package lab3.abstr;

public class UbuntuFactory implements GUIFactory{
    @Override
    public Button  createbutton(){
        return new UbuntuButton();
    }
    @Override
    public Checkbox createcheckbox(){
        return new UbuntuCheck();
    }
}
