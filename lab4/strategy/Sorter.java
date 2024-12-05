package lab4.strategy;

public class Sorter{
    private Sortstrategy str;

    public void getStrategy(Sortstrategy str){
        this.str = str;
    }
    public void sortArray(int[] array){
        str.Sort(array);
    }
}
