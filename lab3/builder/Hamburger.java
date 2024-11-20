package lab3.builder;

public class Hamburger implements Burgerbuilder {
    private Burger burger1;
    public Hamburger(){
        this.burger1= new Burger();
    }
    @Override
    public void buildSauce(){
        burger1.setSauce("ketchup");
    }
    @Override
    public void buildcutlet(){
        burger1.setCutlet("beef");
    }
    @Override
    public void buildcheese(){
        burger1.setCheese("cheddar");
    }
    @Override
    public Burger getResult(){
        return burger1;
    }
}
