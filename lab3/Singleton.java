package lab3;

public class Singleton {
    private static Singleton Singleton1;
    private Singleton(){
    }
    public static Singleton getSingleton1(){
        if (Singleton1 == null){
            Singleton1 = new Singleton();
        }
        return Singleton1;
    }
}
