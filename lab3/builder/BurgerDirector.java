package lab3.builder;

public class BurgerDirector {
    private Burgerbuilder builder;
    public BurgerDirector(Burgerbuilder builder){
        this.builder = builder;
    }
    public void constructBurger(){
        builder.buildSauce();
        builder.buildcutlet();
        builder.buildcheese();
    }
}
