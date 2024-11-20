package lab3.abstr;

public class LinuxFactory implements GUIFactory{
    @Override
    public Button  createbutton(){
        return new LinuxButton();
    }
    @Override
    public Checkbox createcheckbox(){
        return new LinuxCheck();
    }
}
