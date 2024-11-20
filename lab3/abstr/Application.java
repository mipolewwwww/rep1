package lab3.abstr;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createbutton();
        checkbox = factory.createcheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
