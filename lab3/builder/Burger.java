package lab3.builder;

public class Burger {
    private String sauce;
    private String cutlet;
    private String cheese;

    public void setSauce(String sauce){
        this.sauce = sauce;
    }
    public void setCutlet(String cutlet){
        this.cutlet = cutlet;
    }
    public void setCheese(String cheese){
        this.cheese = cheese;
    }
    @Override
    public String toString(){
        return "Burger{"+
                "sauce = " + sauce+ '\''+
                "cutlet = " +  cutlet + '\''+
                "cheese = " + cheese + '\''+
                '}';

    }

}
