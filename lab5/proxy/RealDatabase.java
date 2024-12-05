package lab5.proxy;

public class RealDatabase implements Database {
    @Override
    public void query(String sql){
        System.out.println("Eq"+sql);
    }
}
